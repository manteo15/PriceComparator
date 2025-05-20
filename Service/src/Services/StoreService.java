package Services;

import DTOs.StoreProductDiscountsFromCSVModel;
import DTOs.StoreProductsFromCSVModel;
import Interfaces.*;
import Models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreService implements IStoreService {

    private final IStoreRepository storeRepository;
    private final IProductPriceRepository productPriceRepository;
    private final IProductDiscountRepository productDiscountRepository;
    private final IProductRepository productRepository;

    public StoreService(IStoreRepository storeRepository, IProductPriceRepository productPriceRepository,
                        IProductDiscountRepository productDiscountRepository, IProductRepository productRepository) {
        this.storeRepository = storeRepository;
        this.productPriceRepository = productPriceRepository;
        this.productDiscountRepository = productDiscountRepository;
        this.productRepository = productRepository;
    }


    @Override
    public void addCurrentProductsAndPricesToStores(List<StoreProductsFromCSVModel> storeProducts, String storeName, Date date) {
        createStore(storeName);

        int storeId = storeRepository.getId(storeName);

        List<ProductPrice> currentProductPrices = mapStoreProductsFromCSVModel(storeProducts, date, storeId);

        storeRepository.addCurrentProductPrices(currentProductPrices, storeId);
    }

    @Override
    public void addFutureProductAndPricesToStores(List<StoreProductsFromCSVModel> futureStoreProducts, String storeName, Date date) {
        createStore(storeName);

        int storeId = storeRepository.getId(storeName);

        List<ProductPrice> futureProductPrices = mapStoreProductsFromCSVModel(futureStoreProducts, date, storeId);

        storeRepository.addFutureProductPrices(futureProductPrices, storeId);
    }

    @Override
    public void addCurrentProductDiscountsToStores(List<StoreProductDiscountsFromCSVModel> storeDiscounts, String storeName) {
        createStore(storeName);

        int storeId = storeRepository.getId(storeName);

        List<ProductDiscount> currentProductDiscounts = mapStoreProductDiscountsFromCSVModel(storeDiscounts, storeId);

        storeRepository.addCurrentProductDiscounts(currentProductDiscounts, storeId);
    }

    @Override
    public void addFutureProductDiscountsToStores(List<StoreProductDiscountsFromCSVModel> storeDiscounts, String storeName) {
        createStore(storeName);

        int storeId = storeRepository.getId(storeName);

        List<ProductDiscount> futureProductDiscounts = mapStoreProductDiscountsFromCSVModel(storeDiscounts, storeId);

        storeRepository.addFutureProductDiscounts(futureProductDiscounts, storeId);
    }

    @Override
    public void createStore(String storeName) {
        if(!storeRepository.exists(storeName)){
            Store newStore = new Store(storeName);
            storeRepository.add(newStore);
        }
    }

    private List<ProductPrice> mapStoreProductsFromCSVModel(List<StoreProductsFromCSVModel> storeProducts, Date date, int storeId){
        List<ProductPrice> productPrices = new ArrayList<ProductPrice>();

        for(StoreProductsFromCSVModel storeProduct:storeProducts){
            String productId = storeProduct.getProduct_id();
            if(!productRepository.exists(productId)){
                Product newProduct = new Product(storeProduct.getProduct_id(), storeProduct.getProduct_name(), storeProduct.getProduct_category(),
                        storeProduct.getBrand(), storeProduct.getPackage_quantity(), PackageUnit.valueOf(storeProduct.getPackage_unit()));
                productRepository.add(newProduct);
            }

            ProductPrice newProductPrice = new ProductPrice(storeProduct.getProduct_id(), storeProduct.getPrice(), Currency.valueOf(storeProduct.getCurrency()),
                    date, storeId);
            if(!productPriceRepository.exists(newProductPrice)){
                productPriceRepository.add(newProductPrice);
                productPrices.add(newProductPrice);
            }
        }

        return productPrices;
    }

    private List<ProductDiscount> mapStoreProductDiscountsFromCSVModel(List<StoreProductDiscountsFromCSVModel> storeDiscounts, int storeId){
        List<ProductDiscount> productDiscounts = new ArrayList<ProductDiscount>();

        for(StoreProductDiscountsFromCSVModel storeDiscount:storeDiscounts){
            String productId = storeDiscount.getProduct_id();
            if(!productRepository.exists(productId)){
                Product newProduct = new Product(storeDiscount.getProduct_id(), storeDiscount.getProduct_name(), storeDiscount.getProduct_category(),
                        storeDiscount.getBrand(), storeDiscount.getPackage_quantity(), PackageUnit.valueOf(storeDiscount.getPackage_unit()));
                productRepository.add(newProduct);
            }

            ProductDiscount newProductDiscount = new ProductDiscount(storeDiscount.getProduct_id(), storeDiscount.getFrom_date(), storeDiscount.getTo_date(),
                    storeDiscount.getPercentage_of_discount(), storeId);
            if(!productDiscountRepository.exists(newProductDiscount)){
                productDiscountRepository.add(newProductDiscount);
                productDiscounts.add(newProductDiscount);
            }
        }

        return productDiscounts;
    }
}
