package javaControlFlow.level1;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%5==0) System.out.println("Divisible by 5");
        else System.out.println("Not Divisible by 5");
    }
}
