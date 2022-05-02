package programmer.zaman.now.application;

import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;
import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Animal App", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {

        // this polymorphism to access the abstract method
        Animal animal = new Cat();
        animal.name = "Puss and booth";
        animal.run();


    }
}
