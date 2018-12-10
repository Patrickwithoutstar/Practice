package comp1110.homework.J13;

import comp1110.homework.O04.Sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double> numList = new ArrayList<>();

        while (in.hasNext()) {
            Double a = in.nextDouble();
            numList.add(a);
        }
        in.close();
        double sum = 0;
        for (Double aDouble : numList) {
            sum += aDouble;
        }
        double res = sum / numList.size();
        System.out.println(res);
    }
}
