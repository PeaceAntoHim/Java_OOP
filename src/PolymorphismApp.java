public class PolymorphismApp {

    public static void main(String[] args) {

        // Learn how to polymorphism an object inheritance
        Employee employee = new Employee("Frans");
        employee.sayHello("Bastian");

        employee = new Manager("Momo");
        employee.sayHello("Budi");

        employee = new VicePrecident("Itcahi");
        employee.sayHello("Eko");

        // This to set code at bellow
        System.out.println("\n This application use polymorphism");
        sayHello(new Employee("Sasuke"));
        sayHello(new Employee("Madara"));
        sayHello(new Employee("Luffy"));

    }

    // Application code use polymorphism
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
