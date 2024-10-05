package org.example.model;

public class Chocolate extends ProductForSale {
     private String Brand;
     private boolean dark;

    public Chocolate(double price, String description, String type) {
        super(price, description, type);
    }

    public Chocolate(double price, String description, String type, String brand, boolean dark) {
        super(price, description, type);
        Brand = brand;
        this.dark = dark;
    }

    @Override
    void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "Brand='" + Brand + '\'' +
                ", dark=" + dark +
                '}';
    }
}
