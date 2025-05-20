package Interfaces;

import Models.Product;

import java.util.List;

public interface IProductRepository {
    public void add(Product product);
    public void remove(String productId);
    public boolean exists(String productId);
    public Product getById(String productId);
    public List<Product> getAll();
}
