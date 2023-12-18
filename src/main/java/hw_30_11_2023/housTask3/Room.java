package hw_30_11_2023.housTask3;

public class Room {
    private double area;

    public Room(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void increaseArea(double percent) {
        area += area * percent / 100;
    }
}
