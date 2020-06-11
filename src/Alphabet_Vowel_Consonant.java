import java.util.Scanner;

public class Alphabet_Vowel_Consonant {
    public static void main(String[] args) {  // main method
        Scanner scanner = new Scanner(System.in); // creact object for scanner
        System.out.println("Enter the character"); // print there enter the charcter
        char ch = scanner.next().charAt(0); // create  char scanner
        switch (ch) {
            case 'a': case'o': case 'e': case 'U': case 'i':
                System.out.println(ch + " given character is an vowel"); // print the given character is an vowel
                break;
            default:
                System.out.println(ch +" given character is a  consonant   "); // print the character consonant


    }
}}
