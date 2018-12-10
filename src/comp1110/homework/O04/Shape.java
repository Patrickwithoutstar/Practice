package comp1110.homework.O04;

public abstract class Shape {
    double x;
    double y;

    public abstract double perimeter();

    public abstract double area();

    public abstract boolean overlaps(Shape a);

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double disSquare = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        return Math.pow(disSquare, 0.5);
    }
}
