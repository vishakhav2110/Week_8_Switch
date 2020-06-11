import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Key_press {

        public static void main(String[] args) { // main method
            Scanner scanner = new Scanner(System.in); // print Statement

            System.out.println("Please enter any number from 0 to 9: "); // user input

            int number =  scanner.nextInt();

            switch  (number) {

                case 0:    case 1: case 2: case 3: case 4 : case 5: case 6: case 7: case 8: case 9:
                    System.out.println("That number is : " + number ); // print character
                    break;

                default:
                        System.out.println("Not Allowed "); // print not allowed

                }
            }
            {
    }
}



