package programmer.zaman.now.application;

// This package just import one
    //import programmer.zaman.now.data.Product;
// This package import all
import programmer.zaman.now.data.*;

public class Appplication {
    public static void main(String[] args) {

        Product product = new Product("windows 11", 1000000);
        System.out.println(product.name);
        System.out.println(product.price);


    }
}
