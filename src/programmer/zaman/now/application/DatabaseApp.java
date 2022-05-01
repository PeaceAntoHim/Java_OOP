package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

// This to error handler at java but not suggest if the error not so important
public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Frans", null);
        System.out.println("Success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Cannot to connect database");
        }
    }
}
