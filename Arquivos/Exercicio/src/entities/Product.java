package entities;

public class Product {
    private String name;
    private Double unitPrice;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.unitPrice = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double totalValue(){
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return name + "," + String.format("%.2f", totalValue());
    }
}
