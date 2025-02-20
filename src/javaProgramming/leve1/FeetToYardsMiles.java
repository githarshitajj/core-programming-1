package javaProgramming.leve1;

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceYards = distanceInFeet / 3;
        double distanceMiles = distanceYards / 1760;

        System.out.println("The distance in yards is " + distanceYards + " and in miles is " + distanceMiles);
    }
}
