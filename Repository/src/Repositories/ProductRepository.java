package Repositories;

import Interfaces.IProductRepository;
import Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<Product>();
    }

    @Override
    public void add(Product product) {
        if(getById(product.getId()) == null){
            products.add(product);
        }
    }

    @Override
    public void remove(String productId) {
        Product product = getById(productId);
        if(product != null){
            products.remove(product);
        }
    }

    @Override
    public Product getById(String productId) {
        for(Product p:products){
            if(p.getId().equals(productId)){
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }


}
