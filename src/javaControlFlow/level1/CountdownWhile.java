package javaControlFlow.level1;

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown number: ");
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
