package comp1110.homework.J04;

import java.util.Scanner;

public class
Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sourceBase = in.nextInt();
        int destinationBase = in.nextInt();
        String number = in.next();
        in.close();
        int sourceRadixNum = Integer.parseInt(number, sourceBase);//Integer.parse(String,radix)
        System.out.println(Integer.toString(sourceRadixNum, destinationBase));//Integer.toString(int,radix)
    }
}
