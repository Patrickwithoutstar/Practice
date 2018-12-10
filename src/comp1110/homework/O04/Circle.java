package comp1110.homework.O04;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        super.x = x;
        super.y = y;
    }

    @Override
    public double perimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean overlaps(Shape a) {
        if (a instanceof Circle) {
            if (Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2) < Math.pow(this.radius + ((Circle) a).radius, 2)) {
                return true;
            } else return false;
        }
        //
        //  __1|___2___|_3_
//             |       |
//            8|  9    |4
//          ___|_______|__
//            7|   6   |5
//
        if (a instanceof Square) {

            double halfLength = ((Square) a).sideLength * 0.5;
            if (this.y > a.y + halfLength) {
                if (this.x < a.x - halfLength) {
                    if (getDistance(a.x - halfLength, a.y + halfLength, this.x, this.y) >= this.radius) {
                        return false;
                    } else {
                        return true;
                    }
                }//position 1:
                if (this.x <= a.x + halfLength && this.x >= a.x - halfLength) {
                    if (Math.abs(this.y - a.y) >= this.radius + halfLength) {
                        return false;
                    } else return true;
                }//position 2:
                if (this.x > a.y + halfLength) {
                    if (getDistance(a.x + halfLength, a.y + halfLength, this.x, this.y) >= this.radius) {
                        return false;
                    } else {
                        return true;
                    }
                }//position 3:
            }
            if (this.y <= a.y + halfLength && this.y >= a.y - halfLength) {
                if (this.x < a.x - halfLength) {
                    if (Math.abs(this.x - a.x) >= this.radius + halfLength) {
                        return false;
                    } else return true;
                }//position 8:
                if (this.x <= a.x + halfLength && this.x >= a.x - halfLength) {
                    return true;
                }//position 9:
                if (this.x > a.x + halfLength) {
                    if (Math.abs(this.x - a.x) >= this.radius + halfLength) {
                        return false;
                    } else return true;
                }//position 4:
            } else {
                if (this.x < a.x - halfLength) {
                    if (getDistance(a.x - halfLength, a.y - halfLength, this.x, this.y) >= this.radius) {
                        return false;
                    } else {
                        return true;
                    }
                }//position 7:
                if (this.x <= a.x + halfLength && this.x >= a.x - halfLength) {
                    if (Math.abs(this.y - a.y) >= this.radius + halfLength) {
                        return false;
                    } else return true;
                }//position 6:
                if (this.x > a.x + halfLength) {
                    if (getDistance(a.x + halfLength, a.y - halfLength, this.x, this.y) >= this.radius) {
                        return false;
                    } else {
                        return true;
                    }
                }//position 5:
            }

        }
        return false;
    }
}
