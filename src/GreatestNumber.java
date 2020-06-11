import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("enter the frist number ");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number ");
        int num2 = scanner.nextInt();
        System.out.println(" enter the third number");
        int num3= scanner.nextInt();

        if (num1>=num2 ) {

            if (num1 >= num3) {
                System.out.println( num1 + " is largest number " );
            } else {
                System.out.println( num3 + " is largest number " );

            }
        } else {
            if (num2>=num3) {
                System.out.println(num2+ " is larggest number ");


            }


        }
    }




}
