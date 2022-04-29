public class ManagerApps {
    public static void main(String[] args) {

        // This to call parent class
        var manager = new Manager("Frans");
        manager.name = "Frans";
        manager.sayHello("Sebastian");

        // This to call to child class
        var vp = new VicePrecident("Bastian");
        vp.name = "Budi";
        vp.sayHello("Frans");

    }
}
