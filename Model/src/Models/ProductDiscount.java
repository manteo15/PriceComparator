package Models;

import java.util.Date;

public class ProductDiscount {
    private int id;
    private static int count = 0;
    private String productId;
    private Date fromDate;
    private Date toDate;
    private int percentDiscount;

    public ProductDiscount(String productId, Date fromDate, Date toDate, int percentDiscount) {
        setId(++count);
        this.productId = productId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.percentDiscount = percentDiscount;
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
}
