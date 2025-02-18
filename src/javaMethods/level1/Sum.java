package javaMethods.level1;

import java.util.Scanner;

public class Sum {
    public int sumOfn(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Sum s1 = new Sum();
        System.out.println(s1.sumOfn(n));
    }
}
