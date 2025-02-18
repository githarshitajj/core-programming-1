package javaProgramming.level2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float add = n1+n2;
        float sub = n1-n2;
        float mul = n1*n2;
        float div = n1/n2;
        System.out.println("the numbers: "+n1+" "+n2);
        System.out.println("addition: "+add);
        System.out.println("subtraction: "+sub);
        System.out.println("multiplication: "+mul);
        System.out.println("division: "+div);
    }
}
