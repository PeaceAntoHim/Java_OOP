package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class Appplication {

    public static void main(String[] args) {
        Product product = new Product("windows 11", 1000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
