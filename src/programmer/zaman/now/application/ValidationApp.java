package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationExceptions;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest( null, "123456");

        // Thia to get validation exception
        // Example 1
        //        try {
        //            ValidationUtil.validate(loginRequest);
        //            System.out.println("Data Valid");
        //        } catch (ValidationExceptions exceptions) {
        //            System.out.println("Data not valid : " + exceptions.getMessage());
        //            // Made dual exception
        //        } catch (NullPointerException exception) {
        //            System.out.println("Data null : " + exception.getMessage());
        //        }
        // Example 2
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
            // Made dual exception
        } catch (ValidationExceptions | NullPointerException exceptions) {
            System.out.println("Data not valid : " + exceptions.getMessage());
            // Made finally keyword allways execute
        } finally {
            System.out.println("This will execute");
        }

        // This code to access runtime exception
    }
}
