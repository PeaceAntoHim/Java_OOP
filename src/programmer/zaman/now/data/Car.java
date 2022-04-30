package programmer.zaman.now.data;

// Learn how to made interface class at java
    //public interface Car {
    //
    //    void drive();
    //
    //    int getTier();
    //
    //}
// Learn how to made interface inheritance in java

// if you want to implements more interface inheritance you can added this
public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int getTier();

    // How to resolve probleam if we want to access interface inhertiance
    default boolean isBig() {
        return false;
    };
}
