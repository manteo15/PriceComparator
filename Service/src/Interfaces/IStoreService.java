package Interfaces;

import DTOs.StoreProductDiscountsFromCSVModel;
import DTOs.StoreProductsFromCSVModel;

import java.util.Date;
import java.util.List;

public interface IStoreService {

    public void addCurrentProductsAndPricesToStores(List<StoreProductsFromCSVModel> storeProducts, String storeName, Date date);
    public void addFutureProductAndPricesToStores(List<StoreProductsFromCSVModel> storeProducts, String storeName, Date date);
    public void addCurrentProductDiscountsToStores(List<StoreProductDiscountsFromCSVModel> storeDiscounts, String storeName);
    public void addFutureProductDiscountsToStores(List<StoreProductDiscountsFromCSVModel> storeDiscounts, String storeName);
    public void createStore(String storeName);

}
