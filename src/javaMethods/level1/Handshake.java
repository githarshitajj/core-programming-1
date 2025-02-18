package javaMethods.level1;

import java.util.Scanner;

public class Handshake {
    public int handshake(int n){
        return (n*(n-1))/2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of students: ");
        int n=sc.nextInt();
        Handshake c1=new Handshake();
        int result = c1.handshake(n);
        System.out.println("no. of handshakes in this class: " + result);
    }
}
