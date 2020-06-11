import java.sql.SQLOutput;
import java.util.Scanner;

public class Input_3_Number_Greatest {
    public static void main(String[] args) {  // main method
        {
            Scanner scanner = new Scanner(System.in); // creat an object for scanner class
            System.out.println("Enter the three number X: "); // printing out enter the three number
            int x= scanner.nextInt();  // print out value
            System.out.println("Enter the Y Value");
            int y= scanner.nextInt();  // print out value
            System.out.println("Enter Z Value");
            int z= scanner.nextInt();  // print out value

            if (x>y && x>z) // input value
            {
                System.out.println("Greter value is x: "+ x); // print greter value is x
            } else if (y>z) {
                System.out.println( "Greter value is y: " + y ); // print greter value is y
            }  else
                System.out.println("Grether value is z: " +z);  // print greter value is z
            }


            }
}
