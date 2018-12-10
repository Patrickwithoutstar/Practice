package comp1110.homework.J10;

public class SquareRoot {
    public static String findPreciseRoot(int n, int d) {
        if (n < 0) return "-1";
        double rowRes = Math.pow(n, 0.5);

        if (rowRes % 1 == 0) {
            return String.format("%." + 0 + "f", rowRes);
        } else {
            return String.format("%." + d + "f", rowRes);
        }
    }
}
