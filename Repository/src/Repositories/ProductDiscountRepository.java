package Repositories;

import Interfaces.IProductDiscountRepository;
import Models.ProductDiscount;
import Models.ProductPrice;

import java.util.ArrayList;
import java.util.List;

public class ProductDiscountRepository implements IProductDiscountRepository {

    private List<ProductDiscount> productDiscounts;

    public ProductDiscountRepository() {
        this.productDiscounts = new ArrayList<ProductDiscount>();
    }

    @Override
    public void add(ProductDiscount productDiscount) {
        if(!exists(productDiscount)){
            productDiscounts.add(productDiscount);
        }
    }

    @Override
    public void remove(int productDiscountId) {
        ProductDiscount productDiscount = getById(productDiscountId);
        if(productDiscount != null){
            productDiscounts.remove(productDiscount);
        }
    }

    @Override
    public ProductDiscount getById(int productDiscountId) {
        for(ProductDiscount pd:productDiscounts){
            if(pd.getId() == productDiscountId){
                return pd;
            }
        }
        return null;
    }

    @Override
    public List<ProductDiscount> getAll() {
        return productDiscounts;
    }

    private boolean exists(ProductDiscount productDiscount){
        for(ProductDiscount pd:productDiscounts){
            if(pd.getStoreId() == productDiscount.getStoreId() && pd.getProductId().equals(productDiscount.getProductId()) &&
                    pd.getFromDate() == productDiscount.getFromDate() && pd.getToDate() == productDiscount.getToDate()){
                return true;
            }
        }
        return false;
    }
}
