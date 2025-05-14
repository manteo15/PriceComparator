package Models;

import java.util.List;

public class Store {
    private int id;
    private static int count = 0;
    private String name;
    private List<ProductPrice> currentProductPrices;
    private List<ProductPrice> futureProductPrices;
    private List<ProductDiscount> currentProductDiscounts;
    private List<ProductDiscount> futureProductDiscounts;

    public Store(List<ProductPrice> currentProductPrices, List<ProductPrice> futureProductPrices, String name, List<ProductDiscount> currentProductDiscounts,
                 List<ProductDiscount> futureProductDiscounts) {
        setId(++count);
        this.currentProductPrices = currentProductPrices;
        this.futureProductPrices = futureProductPrices;
        this.name = name;
        this.currentProductDiscounts = currentProductDiscounts;
        this.futureProductDiscounts = futureProductDiscounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductPrice> getCurrentProductPrices() {
        return currentProductPrices;
    }

    public void setCurrentProductPrices(List<ProductPrice> currentProductPrices) {
        this.currentProductPrices = currentProductPrices;
    }

    public List<ProductPrice> getFutureProductPrices() {
        return futureProductPrices;
    }

    public void setFutureProductPrices(List<ProductPrice> futureProductPrices) {
        this.futureProductPrices = futureProductPrices;
    }

    public List<ProductDiscount> getCurrentProductDiscounts() {
        return currentProductDiscounts;
    }

    public void setCurrentProductDiscounts(List<ProductDiscount> currentProductDiscounts) {
        this.currentProductDiscounts = currentProductDiscounts;
    }

    public List<ProductDiscount> getFutureProductDiscounts() {
        return futureProductDiscounts;
    }

    public void setFutureProductDiscounts(List<ProductDiscount> futureProductDiscounts) {
        this.futureProductDiscounts = futureProductDiscounts;
    }
}
