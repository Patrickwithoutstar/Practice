package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Cost {
    HashMap<String, Item> storeList = new HashMap<>();

    void addItem(String name, int cost) {

        storeList.put(name, new Item(name, cost));

    }

    void printCost() {
        ArrayList<Item> a = new ArrayList<>(storeList.values());
        Collections.sort(a);
        a.forEach(System.out::println);
    }


    private static int minRest(ArrayList<Integer> prices, int rest) {
        ArrayList<Integer> affordPrices = new ArrayList<>();
        for (Integer price : prices) {
            if (price <= rest)
                affordPrices.add(price);
        }
        if (affordPrices.size()==0)
            return rest;
        else {
            ArrayList<Integer> res = new ArrayList<>();
            affordPrices.forEach(v->res.add(minRest(affordPrices,rest-v)));
            return Collections.min(res);
        }
    }

    int voucherWaste(int value) {
        ArrayList<Item> a = new ArrayList<>(this.storeList.values());
        ArrayList<Integer> price = new ArrayList<>();
        a.forEach(item -> price.add(item.cost));
        return minRest(price,value);
    }

    public class Item implements Comparable<Item> {
        String name;
        int cost;


        public Item(String n, int c) {
            name = n;
            cost = c;
        }

        public int getCost() {
            return cost;
        }


        public String toString() {
            return name + " " + cost;
        }

        @Override
        public int compareTo(Item o) {
            if (this.cost != o.cost) return this.cost - o.cost;
            else return this.name.compareTo(o.name);
        }
    }
}
