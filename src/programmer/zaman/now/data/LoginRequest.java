package programmer.zaman.now.data;

// Learn Record class can't extends another class just can to implements another class
// After we safe kind data at this class we can change cause record class set this to finall class method
public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Made object LoginRequest");
    }

    // This code to learn constructor overloading
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    // Made method at record class
    public void sayHello() {
        System.out.println("Test hallo");
    }
}
