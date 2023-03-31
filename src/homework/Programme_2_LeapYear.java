package homework;

import java.util.Scanner;

/* write a java programme to input any year like (ex;2007)and findout if it leap year or not ?*/
public class Programme_2_LeapYear {
    public static void main (String[]ars){
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
    }
    // checking is it leap yaer or not
    public void isitLeapYear(int year){
        if(year % 4==0 && year% 100!=0||year%400==0){
            System.out.println("The year"+year+"is leap year");
            return;
        }
        System.out.println("The year"+year+"is not a leap yaer ");

    }



















}
