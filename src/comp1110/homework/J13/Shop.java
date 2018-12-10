package comp1110.homework.J13;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<String, Integer[]> items = new HashMap<>();

    void addItem(String name, int stock, int price) {
        Integer[] itemInform = {stock, price};
        items.put(name, itemInform);
    }

    int totalStockValue() {
        int res = 0;
        for (String s : items.keySet()) {
            res += items.get(s)[0] * items.get(s)[1];
        }
        return res;
    }

    void addItem(String name, int stock, int price, int rate, int reorderdays) {
        Integer[] itemInform = {stock, price, rate, reorderdays};
        items.put(name, itemInform);
    }

    HashMap reorder() {
        HashMap<String, Integer> res = new HashMap<>();
        for (String s : items.keySet()) {
            int numOrder = items.get(s)[2] * 7 - items.get(s)[0];
            if (items.get(s)[2] * items.get(s)[3] - items.get(s)[0] > 0) res.put(s, numOrder);
        }
        return res;
    }

}
