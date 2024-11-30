/**
 * Manyu Ghildiyal
 * Section: C
 * Sep 2021
 * Program1.java
 * This program decodes the digits.
 */
import java.util.Scanner;  // importing Scanner class

public class Program1 {
    public static void main(String[] args) {
        // Defining a Scanner object
        Scanner in = new Scanner(System.in);
        
        // Prompting the user with a message
        System.out.print("Enter a 10 digit phone number (e.g. 5131234567): ");
        
        // Saving the given number inside a constant variable
        final long PHONE_NUM = in.nextLong();

        //Initialization And Declaring Variable of Code
        int areaCode = (int) (PHONE_NUM / 10000000); 
        int officeCode = (int) (PHONE_NUM / 10000 - areaCode * 1000);
        int statNum = (int) (PHONE_NUM 
            - (areaCode * 10000000 + officeCode * 10000));
               
        //Printing Out Variables
        System.out.println("(" + areaCode + ") " 
            + officeCode + " - " + statNum);

        //Splitting up the statNum
        int part1 = (int) (statNum / 100);
        int part2 = (int) (statNum - part1 * 100);
        
        //Adding 33
        part1 = part1 + 33;
        part2 = part2 + 33;
        
        //Converting Into Chars
        char partOne = (char) (part1);
        char partTwo = (char) (part2); 
        
        //Printing Out New Variables
        System.out.println("(" + areaCode + ") " 
            + officeCode + " - " + partTwo + partOne);
        
        int newNumber = areaCode * 1000 + officeCode;
        int sum = Integer.MAX_VALUE - newNumber;
        
        System.out.println(sum);
        System.out.println(partTwo + "" + sum + "" + partOne);
                
    }
}
