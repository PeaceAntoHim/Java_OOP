package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

// This code implements interface
public class CarApp {
    public static void main(String[] args) {
        // This use polymorpishm
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
