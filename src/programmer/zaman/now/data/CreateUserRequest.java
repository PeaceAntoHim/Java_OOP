package programmer.zaman.now.data;

import programmer.zaman.now.annotation.NotBlank;

public class CreateUserRequest {

    // This for all input data
    @NotBlank
    private String usename;

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    public String getUsename() {
        return usename;
    }


    // This for getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
