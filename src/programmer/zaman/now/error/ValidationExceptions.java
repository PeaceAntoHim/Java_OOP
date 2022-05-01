package programmer.zaman.now.error;

// Learn how to throw error
public class ValidationExceptions extends Throwable {

    private String message;

    public ValidationExceptions(String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return message;
//    }
}
