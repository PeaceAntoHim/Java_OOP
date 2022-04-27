class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Constractor OOP / method yang akan di panggil ketika object di buat
        // Contoh pertama
        Person(String paramName, String paramAddress) {
            name = paramName;
            address = paramAddress;
        }

        // Constractor Overloading
        Person(String paramName) {
            // Call another Constractor use this function
            this(paramName, null);
            // Use without this
            name = paramName;
        }

        // Example 2 to call another constructor
        Person() {
            this(null);
        }

    // Method at OOP
        // Contoh Pertama
        void sayHello(String paramName) {
            System.out.println("Hello " + paramName + ", My name is " + name);
        }

}


