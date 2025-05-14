package Models;

public class ProductCategory {
    private static int count = 0;
    private int id;
    private String name;

    public ProductCategory(String name) {
        this.name = name;
        setId(++count);
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
}
