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
        sayHello(new Manager("Madara"));
        sayHello(new VicePrecident("Luffy"));

        // This code to check code use Type Check and Casts
        System.out.println("\n This application use instanceof to gave logic");
        sayHallo(new Employee("Zoro"));
        sayHallo(new Manager("Sanji"));
        sayHallo(new VicePrecident("Chopper"));

    }

    // Application code use polymorphism
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }

    // Contoh kedua use Type Check and Casts to check
    static void sayHallo(Employee employee) {
        if (employee instanceof VicePrecident) {
            VicePrecident vicePrecident = (VicePrecident) employee;
            System.out.println("Hello VP " + vicePrecident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
