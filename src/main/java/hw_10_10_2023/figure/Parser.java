package hw_10_10_2023.figure;

public class Parser {
    public static GeometricFigure parseFigure(String input) {

        String[] parts = input.split(" ");
        String figureName = parts[0];
        double[] parameters = new double[parts.length - 1];
        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = Double.parseDouble(parts[i + 1]);
        }

        if (figureName.equals("Круг")) {
            double radius = parameters[0];
            return new Circle(radius);
        } else if (figureName.equals("Прямоугольник")) {
            double width = parameters[0];
            double height = parameters[1];
            return new Rectangle(width, height);
        } else if (figureName.equals("Треугольник")) {
            double side1 = parameters[0];
            double side2 = parameters[1];
            double side3 = parameters[2];
            return new Triangle(side1, side2, side3);
        }
        return null;
    }
}