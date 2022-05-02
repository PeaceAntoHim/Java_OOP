package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

public class ReflactionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsename("Frans");
        request.setPassword("123456");
        request.setName("Bastian");

        ValidationUtil.validationReflection(request);
    }
}
