package Models;

import java.util.Date;

enum Currency{
    RON
}

public class ProductPrice {
    private int id;
    private static int count = 0;
    private String productId;
    private float price;
    private Currency currency;
    private Date date;

    public ProductPrice(String productId, float price, Currency currency, Date date) {
        setId(++count);
        this.productId = productId;
        this.price = price;
        this.currency = currency;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
