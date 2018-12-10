package comp1110.homework.J13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String findName = null;
        while (in.hasNext()) {
            String[] person = in.nextLine().split(" ");

            if (person.length == 2) people.put(person[0], Integer.parseInt(person[1]));
            findName = person[0];
        }

        if (people.containsKey(findName)) System.out.println(people.get(findName));
        else System.out.println("unknown");

    }
}
