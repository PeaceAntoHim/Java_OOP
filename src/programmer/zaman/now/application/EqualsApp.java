package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        // This are how to compare object at java can't use double equals
        String first = "Frans";
        first = first + " " + "Sebastian";

        System.out.println(first);

        String second = "Frans Sebastian";
        System.out.println(second);

        System.out.println("This use double equals " + first == second);
        System.out.println("This use equals keyword " + first.equals(second));

        String third = "Frans Sebastian";
        System.out.println("This use double equals " + second == third);
        System.out.println("This use equals keyword " + second.equals(third));
    }

}
