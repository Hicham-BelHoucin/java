package java_module_00.ex02;

import java.util.Scanner;

public class Program {

    static int sumOfDigits(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext() && sc.hasNextInt()) {
            int number = sc.nextInt();
            number = sumOfDigits(number);
            if (isPrime(number))
                count++;
        }
        System.out.format("Count of coffee-request : %d\n", count);
        sc.close();
    }
}
