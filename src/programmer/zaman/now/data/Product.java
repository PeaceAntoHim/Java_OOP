package programmer.zaman.now.data;


// Access modifier
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

}
