/*
    Name: Manyu Ghildiyal
    Date: 9/17/2021
    Lab 4 - Free Time Calculator 
*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboardReader = new Scanner(System.in);
        
        //Get Person's Name
        System.out.printf("Enter your first and last name: ");
        
        //Declare Variable for First and Last Name
        String firstName = keyboardReader.next();
        String lastName = keyboardReader.next();
        
        //Get time spent sleeping
        System.out.printf(
            "Enter your time spent sleeping each night (in hours): ");
        double hoursOfSleep = keyboardReader.nextDouble();
        
        //Get number of classes
        System.out.printf("Enter your number of classes: ");
        int classes = keyboardReader.nextInt();
        
        //Approximate Free Time
        double freeTime = 120 - (hoursOfSleep * 5 + classes * 8.72);
        
        //Print Out Results
        //Top Border
        System.out.printf(" " + "_".repeat(44) + "\n");
        
        //Naming Columns
        System.out.printf("|%-20s", "Name");
        System.out.printf("|%-12s", "Num Classes");
        System.out.printf("|%-10s", "Free Time |"  + "\n");
        
        //Dots
        System.out.printf("|" + ".".repeat(44) + "|\n");
        
        //Print Out Results
        String wholeName = firstName + " " + lastName;
        System.out.printf("|%-20s", wholeName);
        System.out.printf("|%-12d", classes);
        System.out.printf("|%-10.1f|\n", freeTime);
       
        //Dashes
        System.out.printf(" " + "-".repeat(44) + "\n");
        
        
        //PART 3
        //------
        //------
        
        System.out.printf("Enter an input filename: ");
        String filename = keyboardReader.next();
        Scanner file = new Scanner(new File(filename));
        
        //Get The Variable
        String fileFirst = file.next();
        String fileLast =  file.next();
        double fileSleep = file.nextDouble();
        int fileClasses = file.nextInt();
        
        double fileFreeTime = 120 - (fileSleep * 5 + fileClasses * 8.72);
                
        //Print Out Results
        //Top Border
        System.out.printf(" " + "_".repeat(44) + "\n");
        
        //Naming Columns
        System.out.printf("|%-20s", "Name");
        System.out.printf("|%-12s", "Num Classes");
        System.out.printf("|%-10s", "Free Time |"  + "\n");
        
        //Dots
        System.out.printf("|" + ".".repeat(44) + "|\n");
        
        //Print Out Results
        String fileWholeName = fileFirst + " " + fileLast;
        System.out.printf("|%-20s", fileWholeName);
        System.out.printf("|%-12d", fileClasses);
        System.out.printf("|%-10.1f|\n", fileFreeTime);
       
        //Dashes
        System.out.printf(" " + "-".repeat(44) + "\n");
        
        file.close();
        
        //Part 4
        //
        //
        System.out.printf("Enter an output filename: ");
        String newFileName = keyboardReader.next();
        PrintWriter writer = new PrintWriter(new File(newFileName));
        
        //Result 1
        writer.printf(" " + "_".repeat(44) + "\n");
        writer.printf("|%-20s", "Name");
        writer.printf("|%-12s", "Num Classes");
        writer.printf("|%-10s", "Free Time |"  + "\n");
        writer.printf("|" + ".".repeat(44) + "|\n");
        writer.printf("|%-20s", wholeName);
        writer.printf("|%-12d", classes);
        writer.printf("|%-10.1f|\n", freeTime);
        
        //Result 2 - Modified
        writer.printf("|" + ".".repeat(44) + "|\n");
        writer.printf("|%-20s", fileWholeName);
        writer.printf("|%-12d", fileClasses);
        writer.printf("|%-10.1f|\n", fileFreeTime);
        writer.printf(" " + "-".repeat(44) + "\n");        
        
        writer.close();       
    } //end main
} //end class
