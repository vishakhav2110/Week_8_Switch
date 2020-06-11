import java.util.Scanner;

public class City_name {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // cerct object scanner
        System.out.println("Enter the  uppercase  alphabet A to F : "); // print alphabet a to f
       char city = scanner.next().charAt(0); // creact object
        switch ( city ){

            case 'A':
                System.out.println( city + " = America "); // print city name America
            break;
            case 'B':
                System.out.println( city + " = Boston "); // print city name Boston
                break;
            case 'C':
                System.out.println( city + " = China "); // print city name china
                break;
            case 'D':
                System.out.println( city + " = Denmark  "); // print city name denmark
                break;
           case  'E':
               System.out.println( city + " = England "); // print city name england
                break;
          case  'F' :
               System.out.println( city + " =  Florida "); // print city name florida
                break;
            default:
                System.out.println("Invalid entry" ); // print invalid entry







        }
    }
}
