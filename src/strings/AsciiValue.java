package strings;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        // Write a Program to find the characters and their ASCII values in a string
        // and display it
        // Method to find the characters and their ASCII values in a string and
        // return them in a 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of characters: ");
        int cols = sc.nextInt();
        //char[][] ascii = new char[2][cols];
        char[] ascii = new char[cols];
        for(int i=0; i<cols; i++){
            ascii[i] = sc.next().charAt(0);
        }
//        for(int i=0; i<cols; i++){
//            ascii[1][i] = ascii[0][i];
//        }

        //printing this bs
        for(int i=0; i<cols; i++){
            System.out.println(ascii[i] + " -> " + (int)ascii[i]);
        }


    }
}
