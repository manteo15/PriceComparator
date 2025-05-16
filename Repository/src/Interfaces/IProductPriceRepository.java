package Interfaces;

import Models.ProductPrice;

import java.util.List;

public interface IProductPriceRepository {
    public void add(ProductPrice productPrice);
    public void remove(int productPriceId);
    public ProductPrice getById(int productPriceId);
    public List<ProductPrice> getAll();
}
