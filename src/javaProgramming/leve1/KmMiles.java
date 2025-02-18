package javaProgramming.leve1;

public class KmMiles {
    public static void main(String[] args) {
        float km = 10.8f;
        float convertFac = 1.6f;
        float miles = km * convertFac;
        System.out.printf("the distance %.2f km is %.2f in miles%n", km , miles); //using placeholders in java
    }
}
