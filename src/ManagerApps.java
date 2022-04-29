public class ManagerApps {
    public static void main(String[] args) {

        // This to call parent class
        var manager = new Manager();
        manager.name = "Frans";
        manager.sayHello("Sebastian");

        // This to call to child class
        var vp = new VicePrecident();
        vp.name = "Budi";
        vp.sayHello("Frans");

    }
}
