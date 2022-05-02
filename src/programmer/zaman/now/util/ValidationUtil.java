package programmer.zaman.now.util;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationExceptions;
import programmer.zaman.now.annotation.NotBlank;

import java.lang.reflect.Field;

public class ValidationUtil {

    // This checked exception to validation user
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

    // This runtime exception to validation user
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new BlankException("Usename should not null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username should not blank");
        } else if (loginRequest.password() == null) {
            throw new BlankException("Password should not null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password should not blank");
        }
    }

    // This to made validation when we want to create new user implement reflection
    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields) {
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null) {
                // Validate
                try {
                    String value = (String) field.get(object);
                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Can't to access field " + field.getName());
                }
            }

        }
    }

}
