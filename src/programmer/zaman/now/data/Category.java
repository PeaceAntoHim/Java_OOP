package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

public class Category {

    // This is encapsulation good to set private cause we can extend the value
    private String id;

    private boolean expensive;

    // This are getter function
    public String getId() {
        return id;
    }

    // This are setter function
    public void setId(String id) {
        // Validation in setter
        if (id != null) {
            this.id = id;
        }
    }

    // This are getter function
    public boolean isExpensive() {
        return this.expensive;
    }

    // This are setter function
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }


}
