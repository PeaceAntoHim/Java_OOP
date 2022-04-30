package programmer.zaman.now.application;

import static programmer.zaman.now.data.Application.PROCESSORS;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // This var to access static method class
        // This Before import static package
        //        System.out.println(Constant.APPLICATION);
        //        System.out.println(Constant.VERSION);

        // This use import static
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // This method to access static method class
        System.out.println(
                MathUtil.sum(1, 3, 5, 2, 5, 2)
        );

        // This class to access static method class
        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        // This to access Static Block
        // This before import static
        //        System.out.println("This is my core CPU " + Application.PROCESSORS);

        // This after import static package
        System.out.println("This is my core CPU " + PROCESSORS);

    }
}
