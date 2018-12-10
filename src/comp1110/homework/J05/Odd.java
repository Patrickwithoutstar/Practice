package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int i) {
//        if (i % 2 == 0) return false;
//        else return true;
        return i%2 != 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (isOdd(x)) System.out.println(x + " is odd");
        else System.out.println(x + " is even");
    }
}
