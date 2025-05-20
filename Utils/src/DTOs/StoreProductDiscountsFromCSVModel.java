package DTOs;

import java.util.Date;

public class StoreProductDiscountsFromCSVModel {

    private String product_id;
    private String product_name;
    private String brand;
    private float package_quantity;
    private String package_unit;
    private String product_category;
    private Date from_date;
    private Date to_date;
    private int percentage_of_discount;

    public StoreProductDiscountsFromCSVModel(String product_id, int percentage_of_discount, Date to_date, Date from_date, String product_category,
                                             String package_unit, float package_quantity, String brand, String product_name) {
        this.product_id = product_id;
        this.percentage_of_discount = percentage_of_discount;
        this.to_date = to_date;
        this.from_date = from_date;
        this.product_category = product_category;
        this.package_unit = package_unit;
        this.package_quantity = package_quantity;
        this.brand = brand;
        this.product_name = product_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPackage_quantity() {
        return package_quantity;
    }

    public void setPackage_quantity(float package_quantity) {
        this.package_quantity = package_quantity;
    }

    public String getPackage_unit() {
        return package_unit;
    }

    public void setPackage_unit(String package_unit) {
        this.package_unit = package_unit;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    public int getPercentage_of_discount() {
        return percentage_of_discount;
    }

    public void setPercentage_of_discount(int percentage_of_discount) {
        this.percentage_of_discount = percentage_of_discount;
    }
}
