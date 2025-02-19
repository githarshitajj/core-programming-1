package strings.level1;

import java.util.Arrays;
import java.util.Scanner;

public class CharArrayAtHome {
    public char[] myCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Arrays.toString(new CharArrayAtHome().myCharArray(s))); //creating temp obj to access the method
        System.out.println(Arrays.toString(s.toCharArray()));
    }

}
