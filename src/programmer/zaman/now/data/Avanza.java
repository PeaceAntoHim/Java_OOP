package programmer.zaman.now.data;

// This method use interface and use multiple interface if we implement more than one interface inheritance
public class Avanza implements Car, IsMaintenance{

    // this implement all cause if one not all error
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    // This to solve porbleam interface inheritance if we want to our class concret without change to abastract class
    public String getBrand() {
        return "Merchedes Banze";
    }

    // This method is override to resolve error multiple interface inheritance
    public boolean isMaintenance() {
        return false;
    }

    // This method to access interface inheritance with default value
    public boolean isBig() {
        return false;
    }
}
