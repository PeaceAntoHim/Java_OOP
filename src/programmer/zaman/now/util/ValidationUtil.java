package programmer.zaman.now.util;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationExceptions;

public class ValidationUtil {

    // This validation user
    public static void validate(LoginRequest loginRequest) throws ValidationExceptions, NullPointerException{
        if (loginRequest.username() == null) {
            throw  new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationExceptions("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationExceptions("Password is blank");
        }
    }

}
