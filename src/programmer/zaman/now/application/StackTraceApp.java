package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {

        // This to create StackTraceElements and get the bug
            //        try {
            //            String[] names = {
            //                    "Frans", "Sebastuian"
            //            };
            //
            //            System.out.println(names[100]);
            //        } catch (Throwable throwable) {
            //            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            //
            //            throwable.printStackTrace();
            //        }

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    // If the error nested
    public static void sampleError() {
        try {
            String[] names = {
                    "Stefanus", "Frans", "Sebastian"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
