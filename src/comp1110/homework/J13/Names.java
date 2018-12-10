package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            names.add(in.nextLine());
        }
        int size = names.size();

        for (int i = 1; i <= size; i++) {
            System.out.println(names.get(size - i));
        }
    }
}
