public class ParentApp {
    public static void main(String[] args) {

        // This code access use Variabel Hiding
        Child child = new Child();
        child.name = "Frans";
        child.doIt();
        System.out.println(child.name);

        // This code to convert to parent
        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
