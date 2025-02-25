package strings.extra1;

public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "Uppercase";
        str = str.toUpperCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
