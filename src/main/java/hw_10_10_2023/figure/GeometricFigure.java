package hw_10_10_2023.figure;

public abstract class GeometricFigure {
    protected String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public abstract void calculateCharacteristics();

    public void print() {
        System.out.println("Характеристики " + name + ":");

    }
}
