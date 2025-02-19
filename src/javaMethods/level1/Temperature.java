package javaMethods.level1;

import java.util.Scanner;

public class Temperature {
    public double calculateWindChill(double temp, double windSpeed){
        return 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed in m/s");
        double windSpeed = sc.nextDouble();
        Temperature temp = new Temperature();
        System.out.println(temp.calculateWindChill(temperature, windSpeed));
    }
}
