class Manager {
    String name;

    // Constructor without parameter is default constructor
    String company;
    Manager() {
        this.name = name;
    }

    // This constructor it's not default cause using parameter
    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }


}
