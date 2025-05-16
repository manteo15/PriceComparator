package Interfaces;

import Models.ProductDiscount;

import java.util.List;

public interface IProductDiscountRepository {
    public void add(ProductDiscount productDiscount);
    public void remove(int productDiscountId);
    public ProductDiscount getById(int productDiscountId);
    public List<ProductDiscount> getAll();
}
