package javaMethods.level1;

import java.util.Scanner;


//have not done validating for valid dates yet
public class SpringSeason {
    public boolean isSpringSeason(int date, int month){
        if(month>=3 && month<=6){
            if(month==3){
                if(date>=20 && date<=31){
                    return true;
                }
                else{
                    return false;
                }
                //can be simply written as "return date>=20 && date<=31"
            }
            else if(month==6){
                return date<=20 && date>=1;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date: ");
        int date = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        SpringSeason s = new SpringSeason();
        System.out.println(s.isSpringSeason(date, month));
    }
}
