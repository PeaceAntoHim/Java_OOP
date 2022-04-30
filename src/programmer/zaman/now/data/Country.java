package programmer.zaman.now.data;

public class Country {

    private String name;

    public String getName() {
        return name;
    }

    // This to made static method use at inner class
    public void setName(String name) {
        this.name = name;
    }

    public static class City {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
