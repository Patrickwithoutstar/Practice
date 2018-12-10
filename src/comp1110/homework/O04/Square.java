package comp1110.homework.O04;

public class Square extends Shape {
    double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    Square(double sideLength, double x, double y) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength * 4;
    }

    @Override
    public double area() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public boolean overlaps(Shape a) {
        if (a instanceof Circle)
            return a.overlaps(this);
        if (a instanceof Square) {
            if (Math.abs(a.x - this.x) < 0.5 * (((Square) a).sideLength + this.sideLength) &&
                    Math.abs(a.y - this.y) < 0.5 * (((Square) a).sideLength + this.sideLength)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
