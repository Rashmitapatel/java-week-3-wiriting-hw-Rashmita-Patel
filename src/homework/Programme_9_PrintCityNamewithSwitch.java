package homework;

import java.util.Scanner;

/* input any alPhabet from "A to F" and print their city name accordingly (use if else)
if any other alphabet should be invalid entry Using Switch statement
 */
public class Programme_9_PrintCityNamewithSwitch {
    public static void main(String[] args){

    //Scanner declaration for reading input from console
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter alphabet betweem AtoF :");
    String city = scanner.next().toUpperCase();
    //Creating object and call instance method
    Programme_9_PrintCityNamewithSwitch cityName = new Programme_9_PrintCityNamewithSwitch();
    // Closing  the scanner object
    scanner.close();
}

    //Printing city name
    public void printCityName(String city){
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case  "B":
            System.out.println("Belfast");
            break;
            case  "C":
            System.out.println("Cambridge");
            break;
            case  "D":
            System.out.println("Derby");
            break;
            case "E":
            System.out.println("Edinburgh");
            break;
            case  "F":
            System.out.println("Feltham");
            break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
        }
    }

