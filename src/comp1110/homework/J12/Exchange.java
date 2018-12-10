package comp1110.homework.J12;

public class Exchange {
    public static <T> T[] swap(T[] a, int i, int j) {
        if (i < a.length && j < a.length && j >= 0 && i >= 0) {
            T[] res = a.clone();
            res[i] = a[j];
            res[j] = a[i];
            return res;
        } else return a;
    }
}
