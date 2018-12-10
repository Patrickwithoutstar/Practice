package comp1110.homework.J06;

import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    public static boolean isPermute(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        if (a.length() != b.length()) {
            return false;
        } else {
            Arrays.sort(charA);
            Arrays.sort(charB);
            for (int i = 0; i < a.length(); i++) {
                if (charA[i] != charB[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        if (isPermute(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
