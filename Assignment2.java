import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

/**.
** Name: Manyu Ghildiyal
** Assignment 2
** 10 / 03 / 2021
**/

public class Assignment2 {
    public static void main(String[] args) throws FileNotFoundException {
        //Initiate Variables
        Scanner keyboardReader = new Scanner(System.in);
        
        //Getting File Name
        System.out.print("Enter an input file name: ");
        String filename = keyboardReader.next();
        
        //Initialize Vars
        //For Reading File
        String fileStrings = "";
        String fileNums = "";
        //Check if it
        //Is the beginning
        int counter = 0;
        
        //Reading File
        Scanner file = new Scanner(new File(filename));
        
        //Check if there is another character
        while (file.hasNext()) {
        
            //Check if it 
            //is an integer
            if (file.hasNextInt()) {
                if (counter != 0) {
                    fileStrings += " ";
                }
                fileNums += file.next();
                counter++;
            //Otherwise
            //Add it to string
            
            } else {
                String checker = file.next();
                
                //Check if it
                //is a new line
                if (checker.equals("#")) {
                    fileStrings += "\n";
                    counter = 0;
                } else {
                    fileStrings += checker;
                    counter++;
                }               
            }
        }
        file.close();
        
        //Print Out Text
        System.out.println(fileStrings);
        
        //If Statement
        boolean continueLoop = true;
        while (continueLoop) {
            //Output File
            System.out.print("**Do you want to print in a file (y/n): ");
            String answer = keyboardReader.next();
            
            if (answer.equals("y")) {
                //Printing out file
                System.out.print("Enter an output file name: ");
                String outputFileName = keyboardReader.next();
                
                //Print File
                PrintWriter writer = new PrintWriter(new File(outputFileName));
                writer.print(fileStrings);
                writer.close();
                
                //End Text
                System.out.println("Printed inside the " 
                    + outputFileName + " successfully!");    
                System.out.println("End!");
                continueLoop = false;
            } else if (answer.equals("n")) {
                //End Text
                System.out.println("End!");
                continueLoop = false;

            } else {
                System.out.print("\n");
                continueLoop = true;
            }
        
        }

    }
}
