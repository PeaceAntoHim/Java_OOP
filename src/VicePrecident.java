class VicePrecident extends Manager {

    // This to resolve super Constructor
    VicePrecident(String name) {
        super(name, null);
    }

    // This is method overiding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }
    
}
