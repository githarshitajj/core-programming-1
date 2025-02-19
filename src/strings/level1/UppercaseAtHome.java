package strings.level1;

import java.util.Scanner;

public class UppercaseAtHome {
    public String myUpperCase(String s) {
        String upperCase = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                upperCase += (char)(s.charAt(i) - 32);  //can use StringBuilder to append as it is
            }
            else{
                upperCase += s.charAt(i);
            }
        }
        return upperCase;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.toUpperCase());
        System.out.println(new UppercaseAtHome().myUpperCase(s));
    }
}
