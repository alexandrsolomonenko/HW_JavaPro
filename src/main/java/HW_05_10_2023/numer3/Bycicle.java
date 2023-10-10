package HW_05_10_2023.numer3;

class Bycicle {
    private String brand;
    private String color;
    private  String material;
    private int wheelSize;
    private int modelYear;

    public Bycicle(String brand, String color, String material, int wheelSize, int modelYear) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.wheelSize = wheelSize;
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Bicycle [brand=%s, color=%s, material=%s, wheelSize=%d, modelYear=%d".formatted(brand, color, material, wheelSize, modelYear);
    }

}
