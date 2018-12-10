package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        if (mark > 100 || mark < 0) System.out.println("Bad mark");
        else if (mark < 50) System.out.println("N");
        else if (mark < 60) System.out.println("P");
        else if (mark < 70) System.out.println("C");
        else if (mark < 80) System.out.println("D");
        else System.out.println("HD");
    }
}
