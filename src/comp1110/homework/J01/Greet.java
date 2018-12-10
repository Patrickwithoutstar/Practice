package comp1110.homework.J01;


import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        System.out.println("Hi " + name+"!");
    }
}
