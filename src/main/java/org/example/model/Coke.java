package org.example.model;

public class Coke extends ProductForSale {

    private String size;
    private String type;

    public Coke(double price, String description, String type) {
        super(price, description, type);
    }



    public Coke(double price, String description, String type, String size, String type1) {
        super(price, description, type);
        this.size = size;
        this.type = type1;
    }


    @Override
    void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
