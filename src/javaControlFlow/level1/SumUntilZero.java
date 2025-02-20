package javaControlFlow.level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();

            if (number == 0) {
                break;
            }

            total += number;
        }

        System.out.println("The total sum is " + total);
    }
}
