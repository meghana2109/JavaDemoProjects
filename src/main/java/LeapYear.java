//WAP to find if Year is Leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //instantiating scanner object
        Scanner sc = new Scanner(System.in);
        //printing to ask the user to enter an year
        System.out.println("Enter an Year : ");
        //scanner scans the user input and assigns the value to variable year
        int year = sc.nextInt();
        //checking if year is divisible by 4 and if remainder is 0
        if(year % 4 == 0 ) {
            //check if year is century
            if (year % 100 == 0) {
                //check if year is divisible by 400
                if(year%400 == 0) {
                    //if yes then print Leap year
                    System.out.println("Year " + year + " is a Leap year");
                }else{
                    System.out.println("Year "+ year +" is not a Leap year");
                }
            }
            else{
                System.out.println("Year " + year + " is a Leap year");
            }
        }
        else{
            //if not then print Not a Leap year
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}
