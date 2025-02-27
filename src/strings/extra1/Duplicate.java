package strings.extra1;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        //removing duplicates from the string
        //replace with ""
        String str = "asasyyagr"; //gonna print "as"
        //char replace = '0';
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            //int count = 0;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    arr[j] = '0';
                }
            }
        }
        str = new String(arr);

        System.out.println(str.replaceAll("0", ""));
    }
}
