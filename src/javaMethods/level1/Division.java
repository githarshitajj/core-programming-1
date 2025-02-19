package javaMethods.level1;

import java.util.Arrays;
import java.util.Scanner;

public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] result = new int[2];
        result[0] = number % divisor; //remainder
        result[1] = number / divisor; //quotient
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        //int[] result = findRemainderAndQuotient(a, b);
        System.out.println(Arrays.toString(findRemainderAndQuotient(a, b)));
    }

}
