package programmer.zaman.now.data;

public class Application {

    // This is static method
    public static final int PROCESSORS;

    static {
        System.out.println("Access class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
