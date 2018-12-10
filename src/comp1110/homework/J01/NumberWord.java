package comp1110.homework.J01;

import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int num = in.nextInt();
        in.close();
        System.out.println(num +", "+ word);
    }
}