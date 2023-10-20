package hw_10_10_2023.figure;

public class Rectangle extends GeometricFigure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Прямоугольник");
        this.width = width;
        this.height = height;
    }

    public void calculateCharacteristics() {
        // Вычисление характеристик прямоугольника
    }

    public void print() {
        super.print();
        // Вывод фигуры в консоль
    }
}