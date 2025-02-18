package javaMethods.level1;

import java.util.Scanner;

public class PosNegZero {
    public int result(int n){
        if(n<0){      //all the conditional can be replaced by Integer.compare(n,0).. which returns the value 1 if x>y, value 0 if x==y and value -1 if x<y
            return -1;
        }
        else if(n>0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        PosNegZero p = new PosNegZero();
        System.out.println(p.result(n));
    }
}
