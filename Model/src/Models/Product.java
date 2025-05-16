package Models;

enum PackageUnit{
    g,
    kg,
    l,
    ml,
    buc,
    role
}

public class Product {
    private String id;
    private String name;
    private String category;
    private String brand;
    private float quantity;
    private PackageUnit unit;

    public Product(String id, String name, String category, String brand, float quantity, PackageUnit unit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public PackageUnit getUnit() {
        return unit;
    }

    public void setUnit(PackageUnit unit) {
        this.unit = unit;
    }
}
