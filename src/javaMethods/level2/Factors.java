package javaMethods.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static int[] factors(int n) {
        int size = n/2+1;
        System.out.println(size);
        int[] factors = new int[size];
        int i;
        for(i=0;i<n/2;){
            if(n%(i+1)==0){
                factors[i] = i+1;
                i++;
            }
        }
        System.out.println(Arrays.toString(factors));
        return factors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        factors(n);
    }
}
