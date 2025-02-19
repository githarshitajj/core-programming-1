package javaMethods.level2;

import java.util.Scanner;

public class LeapYear {
    public boolean isLeap(int year){
        if(year>=1582){
            if(year%4==0){
                if(year%100==0){
                    return false;
                }
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        //taking the year input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        LeapYear obj = new LeapYear();
        System.out.println(obj.isLeap(year));
    }
}
