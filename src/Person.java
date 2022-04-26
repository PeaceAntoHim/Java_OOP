class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Constractor OOP / method yang akan di panggil ketika object di bua
        Person(String paramName, String paramAddress) {
            name = paramName;
            address = paramAddress;
        }

    // Method at OOP
        // Contoh Pertama
        void sayHello(String paramName) {
            System.out.println("Hello " + paramName + ", My name is " + name);
        }

}


