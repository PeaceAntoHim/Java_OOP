package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        // This code to access record method at LoginRequest
        LoginRequest loginRequest = new LoginRequest("Frans", "123456");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println("\n This is constructor");
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("bastian"));
        System.out.println(new LoginRequest("bastian", "123456"));
    }

}
