package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        // this how to set category
        category.setId("ID");
        category.setId(null);


        System.out.println(category.getId());
//      System.out.println(category.isExpensive());

    }
}
