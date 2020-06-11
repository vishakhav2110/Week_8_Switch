import java.util.Scanner;

public class Reverse_String_Abcdef
{
    public static void main(String[] args) // main method
    {
        String input = "abcdef";
        StringBuilder input1 = new StringBuilder(); // Append a string into StringBuilder input 1
        input1.append( input); // reverse StringBuilder
         input1 = input1.reverse();
        System.out.println(input1); // print reverse
    }
}
