package strings.level1;

import java.util.Scanner;

public class Compare {
    public boolean myCompare(String a, String b){
        if(a.length() != b.length()) return false;
        else{
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i) != b.charAt(i)) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Compare obj = new Compare();
        System.out.println(obj.myCompare(str1, str2));
        System.out.println(str1.equals(str2));
        //both gives the same answer

    }
}
