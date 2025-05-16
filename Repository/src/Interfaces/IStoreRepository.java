package Interfaces;

import Models.Store;

import java.util.List;

public interface IStoreRepository {
    public void add(Store store);
    public void remove(int storeId);
    public Store getById(int storeId);
    public List<Store> getAll();
}
