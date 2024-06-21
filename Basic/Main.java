package Basic;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = s.nextInt();
        System.out.println(num + " is prime: " + isPrime(num));

    }
}
