package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String binaryNum = Integer.toString(number, 2);
        int i = 0;
        for (char c : binaryNum.toCharArray()) {
            if (c == '1') {
                i++;
            }
        }
        System.out.println(i);
    }

}

