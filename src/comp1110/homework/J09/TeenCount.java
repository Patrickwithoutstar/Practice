package comp1110.homework.J09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class TeenCount {
    private static boolean applyPredicate(int value, IntPredicate predicate) {
        return predicate.test(value);
    }

    public static int[] teenLess(int[] array) {
        ArrayList<Integer> resList = new ArrayList<>();
        for (int i : array) {
            if (applyPredicate(i, x -> (x < 13 || x > 19))) {
                resList.add(i);
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < res.length; i++) {
           res[i] = resList.get(i);
        }
    return res;
    }
}
