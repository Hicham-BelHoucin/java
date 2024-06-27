package java_module_00.ex01;

import java.util.Scanner; // Import the Scanner class

public class Program {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter A Number : ");
        int i = 0;

        if (myObj.hasNextInt()) { // Check if the input is an integer
            int number = myObj.nextInt();

            if (number <= 1) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            for (i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("false " + (i - 1));
                    System.exit(0);
                }
            }
            System.out.println("true " + (i - 1));
        } else {
            System.err.println("Please enter a valid integer.");
        }
        myObj.close();
    }
}
