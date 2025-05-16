package Repositories;

import Interfaces.IStoreRepository;
import Models.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreRepository implements IStoreRepository {

    private List<Store> stores;

    public StoreRepository() {
        this.stores = new ArrayList<Store>();
    }

    @Override
    public void add(Store store) {
        if(!exists(store)){
            stores.add(store);
        }
    }

    @Override
    public void remove(int storeId) {
        Store store = getById(storeId);
        if(store != null){
            stores.remove(store);
        }
    }

    @Override
    public Store getById(int storeId) {
        for(Store s:stores){
            if(s.getId() == storeId){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Store> getAll() {
        return stores;
    }

    private boolean exists(Store store){
        for(Store s:stores){
            if(s.getName().equals(store.getName())){
                return true;
            }
        }
        return false;
    }
}
