package javaMethods.level1;

import java.util.Arrays;
import java.util.Scanner;

public class Mathematics {
    public double[] calculateTrigonometricFunctions(double angle){
        double[] result = new double[3];
        //convert the degrees in radians
        double radians = Math.toRadians(angle);
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        double angle = sc.nextDouble();
        Mathematics math = new Mathematics();
        System.out.println("the sine, cosine, tangent of the angle");
        System.out.println(Arrays.toString(math.calculateTrigonometricFunctions(angle)));
    }
}
