package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0]= new Bread(10.5,"kepekli","doğal");
        products[1] = new Chocolate(25,"beyaz çikolata","regular");
        products[2] = new Coke(30,"Bebsi","Max");
        products[3] = new Coke(35,"Cola Turka","regular","büyük","hediyeli");
        products[4] = new Chocolate(50,"Special","Dubai","Ülker",false);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {

            if (product != null) {
                product.showDetails();
            }
        }
    }
}