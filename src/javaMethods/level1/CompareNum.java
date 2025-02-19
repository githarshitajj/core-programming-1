package javaMethods.level1;

import java.util.Arrays;
import java.util.Scanner;

public class CompareNum {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3){
        int[] result = new int[2];
        //int max = result[0];  0 index is max
        //int min = result[1];  1 index is min
        if(n1>=n2 && n1>=n3){
            result[0] = n1;
        }
        else if(n2>=n1 && n2>=n3){
            result[0] = n2;
        }
        else {
            result[0] = n3;
        }
        if(n1<=n2 && n1<=n3){
            result[1] = n1;
        }
        else if(n2<=n1 && n2<=n3){
            result[1] = n2;
        }
        else {
            result[1] = n3;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number");
        int n3 = sc.nextInt();
        System.out.println(Arrays.toString(findSmallestAndLargest(n1, n2, n3)));
    }
}
