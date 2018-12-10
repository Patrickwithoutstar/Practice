package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
