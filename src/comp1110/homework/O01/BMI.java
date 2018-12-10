package comp1110.homework.O01;

import java.util.Scanner;

public class BMI {
    private String name;
    private double height;
    private double weight;

    public BMI(String name, double height, double weight) {
        this.height = height;
        this.name = name;
        this.weight = weight;
    }

    public double getBMI() {
        return weight / Math.pow(height, 2.0);
    }

    @Override
    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + this.getBMI() + "Kg/m^2";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        double height = in.nextDouble();
        double weight = in.nextDouble();
        BMI i = new BMI(name, height, weight);
        System.out.println(i);
    }
}
