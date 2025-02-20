package javaControlFlow.level2;

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Multiples of " + number + " below 100: ");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
