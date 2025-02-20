package javaControlFlow.level1;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {
            int sumFormula = number * (number + 1) / 2;
            int sumWhile = 0;
            int i = 1;

            while (i <= number) {
                sumWhile += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
