package hw_10_10_2023.figure;

public class IPrintable {
    public static void main(String[] args) {
        String[] figureInputs = { "Круг 5.2", "Прямоугольник 3.4 5.6", "Треугольник 2.5 3.7 4.6" };
        GeometricFigure[] figures = new GeometricFigure[figureInputs.length];

        for (int i = 0; i < figureInputs.length; i++) {
            figures[i] = Parser.parseFigure(figureInputs[i]);
        }

        for (GeometricFigure figure : figures) {
            figure.calculateCharacteristics();
            figure.print();
        }
    }
}