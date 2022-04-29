public class ManagerApps {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Frans";
        manager.sayHello("Sebastian");

        var vp = new VicePrecident();
        vp.name = "Budi";
        vp.sayHello("Frans");

    }
}
