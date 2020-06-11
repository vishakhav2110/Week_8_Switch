import java.util.Scanner;

public class Number_evan_odd {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // caret scanner object
        System.out.println(" Please Enter the integer  number:"); // print the integer number
       int number = scanner.nextInt(); // input int value

            switch (number%2)
            {
                case 0:
                    System.out.println (number+ " is a Even number: " );// print even number
                    break;
                case 1:
                    System.out.println(number+  "   is a odd number: ");// print odd number
                    break;


            }}}