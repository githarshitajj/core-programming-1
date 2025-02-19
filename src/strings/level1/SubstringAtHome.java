package strings.level1;

import java.util.Scanner;

public class SubstringAtHome {
    public String mySubstring(String str1, int start, int end){
        String ans = "";
        for(int i=start; i<end; i++){
            //ans.append(str1.charAt(i)); -- using StringBuilder to update the string
            ans += str1.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        SubstringAtHome obj = new SubstringAtHome();
        System.out.println(obj.mySubstring(str1, start, end));
        System.out.println(str1.substring(start, end));

    }
}
