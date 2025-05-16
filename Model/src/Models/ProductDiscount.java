package Models;

import java.util.Date;

public class ProductDiscount {
    private int id;
    private static int count = 0;
    private String productId;
    private Date fromDate;
    private Date toDate;
    private int percentDiscount;
    private int storeId;

    public ProductDiscount(String productId, Date fromDate, Date toDate, int percentDiscount, int storeId) {
        setId(++count);
        this.productId = productId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.percentDiscount = percentDiscount;
        this.storeId = storeId;
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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
