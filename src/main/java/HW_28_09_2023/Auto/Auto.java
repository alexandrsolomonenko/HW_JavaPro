package HW_28_09_2023.Auto;

public class Auto {
    public enum AutoType { TRUCK, SPORT_CAR, SEDAN }

    public AutoType type;
    private int enginePower;
    private String brand;
    private String model;

    public Auto(AutoType type) {
        this.type = type;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
