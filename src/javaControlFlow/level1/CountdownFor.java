package javaControlFlow.level1;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown number: ");
        int counter = input.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
