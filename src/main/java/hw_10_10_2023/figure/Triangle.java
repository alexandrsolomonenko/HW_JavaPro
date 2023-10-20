package hw_10_10_2023.figure;

public class Triangle extends GeometricFigure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super("Треугольник");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void calculateCharacteristics() {

    }

    public void print() {
        super.print();

    }
}
