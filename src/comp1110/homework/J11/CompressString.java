package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    private static String compressString(String original) {
        if (original.equals("")) return original;
        String res = Character.toString(original.charAt(0));
        int count = 1;
        for (int i = 0; i < original.length() - 1; i++) {
            if (original.charAt(i) == original.charAt(i + 1)) {
                count += 1;
            } else {
                if (count != 1) {
                    res += Integer.toString(count);
                    count = 1;
                }
                res += Character.toString(original.charAt(i + 1));
            }
        }
        if (count != 1) {
            res += Integer.toString(count);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();
        System.out.println(compressString(original));
    }
}
