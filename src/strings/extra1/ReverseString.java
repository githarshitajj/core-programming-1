package strings.extra1;

public class ReverseString {
    public static void main(String[] args) {
        String str = "dishak";
        char[] temp = new char[str.length()];
        int n = str.length();
        for(int i = 0; i < str.length(); i++) {
            temp[i] = str.charAt(n-1);
            n--;
        }
        str = new String(temp);
        System.out.println(str);
    }
}
