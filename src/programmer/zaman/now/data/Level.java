package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Social Media App", tags = {"Application", "java"})
public enum Level {
    // Enum class usually use to made limited of data like "vip, standard, male, female"
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
