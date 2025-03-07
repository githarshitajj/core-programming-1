package javaProgramming.leve1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; // Convert square inches to square cm

        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters");
    }
}
