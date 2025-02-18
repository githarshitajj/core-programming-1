package javaMethods.level1;

import java.util.Scanner;

public class SimpleInterest {
    public double calculateInterest(double rate, double principle, int time) {
        return (rate*principle*time)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking rate, time and principle
        System.out.println("Enter rate, principle, time respectively: ");
        double rate =sc.nextDouble();
        double principle = sc.nextDouble();
        int time=sc.nextInt();

        //creating an object for the class
        SimpleInterest si=new SimpleInterest();
        double interest = si.calculateInterest(rate, principle, time);
        System.out.println(interest);
        double amount = interest+principle;
        System.out.printf("The amount is %.3f",amount);
    }
}
