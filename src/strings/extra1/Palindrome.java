package strings.extra1;

public class Palindrome {
    public static void main(String[] args) {
        String str = "asa";
        char[] temp = new char[str.length()];
        int n = str.length();
        for(int i = 0; i < str.length(); i++) {
            temp[i] = str.charAt(n-1);
            n--;
        }
        String str1 = new String(temp);
        System.out.println(str.equals(str1));
    }
}
