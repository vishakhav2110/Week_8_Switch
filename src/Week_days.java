import java.util.Scanner;

public class Week_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // main method
        System.out.println("Enter the any number between 1 to 7: "); // print number between 1 to 7
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println(" Sunday is week of the 1st day "); // print sunday of the 1st day
                break;
            case 2:
                System.out.println(" Monday is week of the 2nd day"); // print monday of the 2nd day
                break;
            case 3:
                System.out.println(" tuesday is the week of the 3rd day"); // print tuesday of the 3rd day
                break;
            case 4:
                System.out.println(" Wednesday is the week of the 4th day");  // print wednesday of the 4th day
                break;
            case 5:
                System.out.println(" Thursday is the week of the 5th day ");// print thursday of the 5th day
                break;
            case 6:
                System.out.println(" Friday is the week of the 6th ");// print friday of the 6th  day
                break;
            case 7:
                System.out.println(" Saturday is the week of the 7th ");// print saturday of the 7th  day
                break;
            default:
                System.out.println("Invalid choice 7days of the week ");// print invalid choice 7days of the week


    }
}}
