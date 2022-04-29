class Manager extends Employee {
//    String name;

    // Constructor without parameter is default constructor
    String company;
//    Manager() {
//        this.name = name;
//    }

    // This constructor it's not default cause using parameter
    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }


}
