package org.example.model;

public class Bread extends ProductForSale {

    private String flourType;

    private  String color;

    public Bread(double price, String description, String type) {
        super(price, description, type);
    }

    public Bread(double price, String description, String type, String flourType, String color) {
        super(price, description, type);
        this.flourType = flourType;
        this.color = color;
    }


    @Override
    void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flourType='" + flourType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
