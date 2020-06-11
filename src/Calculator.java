import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in); // main method
        System.out.println("Please Enter First No."); // print enter first no.
        int no1 = s.nextInt();
        System.out.println("Please Enter Second No."); // print enter second no.
        int no2= s.nextInt();
        System.out.println("Please tell us what you like to do Such as +,-.*,%)"); //print tell us what you like..
        String sym=s.next(); // craect object
        int res;
         switch(sym){


             case "+": res=no1+no2; // input value
                 System.out.println("Addition: "+ res); // print addition
                 break;
             case "-": res=no1-no2; // input value
                 System.out.println("Subtraction : "+ res); // print subtraction
                 break;

             case "*": res=no1*no2; // input value
                 System.out.println("Multiplication: "+ res); // print multiplication
                 break;
             case "%": res=no1%no2; // input value
                 System.out.println("Division : "+ res); // print division
                 break;
             default:

                     System.out.println( " Invalid symbol"); // print invalid symbol

    }

}}
