package comp1110.homework.J07;

import java.util.Scanner;

public class Menu {
    public static int findRange(int[] array) {
        int max = getMax(array);
        int min = array[0];
        for (int i : array) {
            if (min > i) min = i;
        }
        return max - min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) max = i;
        }
        return max;
    }

    public static int getSecondHighest(int[] array) {
        int secondMax = getMax(array) - findRange(array);
        for (int i : array) {
            if (i < getMax(array) && i > secondMax){
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Please enter: \n1 to find " +
                "range of the scores\n2 to find the maximum " +
                "score\n3 to find the second highest score"));
        int choice = in.nextInt();
        if (choice>3) {
            System.out.println("Invalid Option Selected");
        }
        int N = in.nextInt();
        int[] array = new int[N];
        int i = 0;
        while (i<N){
            array[i] = in.nextInt();
            i++;
        }
        if (choice == 1) {
            System.out.println(findRange(array));
        }
        else if(choice == 2){
            System.out.println(getMax(array));
        }
        else if(choice == 3){
            System.out.println(getSecondHighest(array));
        }
    }
}

