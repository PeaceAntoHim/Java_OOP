public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Frans", "Pluit");
        // manipulation Field
        person1.name = "Frans";
        person1.address = "Jakarta";
        //person1.country = "indonesia"; error
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println("\nwithout manipulation field");

        Person person2 = new Person("Frans", "Pluit");
        Person person3;
        person3 = new Person("Frans", "Pluit");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // Call method/function at OOP & Constractor
        person1.sayHello("Frans Sebastian");
        person3.sayHello("Frans Sebastian");
    }
}
