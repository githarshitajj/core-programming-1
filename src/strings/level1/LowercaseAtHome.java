package strings.level1;

import java.util.Scanner;

public class LowercaseAtHome {
    public String myLowerCase(String s) {
        String lowerCase = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                lowerCase += (char)(s.charAt(i) + 32);  //can use StringBuilder to append as it is
            }
            else{
                lowerCase += s.charAt(i);
            }
        }
        return lowerCase;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.toLowerCase());
        System.out.println(new LowercaseAtHome().myLowerCase(s));

    }
}
