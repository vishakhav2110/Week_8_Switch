import java.util.Scanner;

public class Number_Positive_Nagative {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // creact new project
        System.out.println("please enter the number "); // print please enter the number
        int x = scanner.nextInt(); // input scanner value
         int y;
         if (x>0)
         {
             y = 1;
         } else if  (x < 0) {

             y = -1;
         }
           else {
               y = 0;}
               switch (y){
                   case 1:
                       System.out.println("Enter positive number:  " +x); // print the positive number
                       break;
                   case - 2:System.out.println("Enter negative number: " +x); // print the negative number
                       break;
                   case 0:
                       System.out.println("Enter the numberZero: " +x); // print the number zero
                       break;
                   default:
                       System.out.println("Invalid entry: "); // print the invalid entry
               }
         }

}

