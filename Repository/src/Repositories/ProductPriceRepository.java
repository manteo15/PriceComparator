package Repositories;

import Interfaces.IProductPriceRepository;
import Models.ProductPrice;

import java.util.ArrayList;
import java.util.List;

public class ProductPriceRepository implements IProductPriceRepository {

    private List<ProductPrice> productPrices;

    public ProductPriceRepository() {
        this.productPrices = new ArrayList<ProductPrice>();
    }

    @Override
    public void add(ProductPrice productPrice) {
        if(!exists(productPrice)){
            productPrices.add(productPrice);
        }
    }

    @Override
    public void remove(int productPriceId) {
        ProductPrice productPrice = getById(productPriceId);
        if(productPrice != null){
            productPrices.remove(productPrice);
        }
    }

    @Override
    public ProductPrice getById(int productPriceId) {
        for(ProductPrice pp:productPrices){
            if(pp.getId() == productPriceId){
                return pp;
            }
        }
        return null;
    }

    @Override
    public List<ProductPrice> getAll() {
        return productPrices;
    }

    private boolean exists(ProductPrice productPrice){
        for(ProductPrice pp:productPrices){
            if(pp.getStoreId() == productPrice.getStoreId() && pp.getProductId().equals(productPrice.getProductId()) &&
                    pp.getDate() == productPrice.getDate()){
                return true;
            }
        }
        return false;
    }
}
