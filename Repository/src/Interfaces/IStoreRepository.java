package Interfaces;

import Models.ProductDiscount;
import Models.ProductPrice;
import Models.Store;

import java.util.List;

public interface IStoreRepository {
    public void add(Store store);
    public void remove(int storeId);
    public void addCurrentProductPrices(List<ProductPrice> productPrices, int storeId);
    public void addFutureProductPrices(List<ProductPrice> productPrices, int storeId);
    public void addCurrentProductDiscounts(List<ProductDiscount> productDiscounts, int storeId);
    public void addFutureProductDiscounts(List<ProductDiscount> productDiscounts, int storeId);
    public boolean exists(String storeName);
    public int getId(String storeName);
    public Store getById(int storeId);
    public List<Store> getAll();
}
