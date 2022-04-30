package programmer.zaman.now.data;


import java.util.Objects;

// Access modifier
// This class public can to access with diffrent type package
public class Product {
    // This public variabel
    public String name;
    public int price;

    // This protected variabel
    protected String name1;
    protected int price1;

    // This function if no to set public will default private
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Learn how toString Method
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    // This method it's to use check the value
    // Example no one
        //    public boolean equals(Object o) {
        //
        //        if(o == this) {
        //            return true;
        //        }
        //
        //        if((o instanceof Product)) {
        //            return false;
        //        }
        //
        //        Product product = (Product) 0;
        //
        //        if(this.price != product.price) {
        //            return false;
        //        }
        //
        //        if(this.name != null ) {
        //            return this.name.equals(product.name);
        //        } else {
        //            return product.name == null;
        //        }
        //
        //    }

    // This is hasCode method
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    // Example no 2
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

}
