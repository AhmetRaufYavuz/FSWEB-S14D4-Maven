package org.example.model;

public abstract class ProductForSale {

    private double price;
    private String description;
    private String type;

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public ProductForSale(double price, String description, String type) {
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public double getSalesPrice(int quantity){
        return quantity * this.price;
    }

    abstract void showDetails();


    @Override
    public String toString() {
        return "ProductForSale{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
