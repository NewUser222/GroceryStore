package sample.grocerystore;

public class Product {
    private static Integer nextID = 1;
    private Integer ID;
    private String name;
    private Integer quantity;
    private Double price;
    private String status;

    public Product(String name, Integer quantity, Double price, String status) {
        this.ID = nextID++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
