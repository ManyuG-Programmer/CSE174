import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

/*
* Name: Manyu Ghildiyal
* Lab: Lab 6 - Grade Calculator
* 10/1/2021
*/
public class Lab6 {
    public static void main(String[] args) throws FileNotFoundException {
       
        //Initiate Variables
        Scanner keyboardReader = new Scanner(System.in);
        
        //Get File Name
        System.out.print("Enter a file name: ");
        String filename = keyboardReader.next();
        
        //Inititate All The Variables
        Scanner file = new Scanner(new File(filename));
        double totalSum = 0;
        double average = 0;
        int numOfStudents = 0;
        double gradeNum = 0;
        String throwAway = "";
        String grades = "";
        
        //Read the File And
        //Get All The Grades
        while (file.hasNextLine()) {
            throwAway = file.next();
            gradeNum = file.nextDouble();
            if (gradeNum >= 90) {
                grades += "A \n";
            } else if (gradeNum >= 80) {
                grades += "B \n";
            } else if (gradeNum >= 70) {
                grades += "C \n";
            } else if (gradeNum >= 60) {
                grades += "D \n";
            } else {
                grades += "F \n";
            }
             
            totalSum += gradeNum;
            numOfStudents++;        
        }
        file.close();

        
        //Get Average
        average = totalSum / numOfStudents;

        
        //Get New File Name
        System.out.print("Enter an output file name: ");
        String newFileName = keyboardReader.next();
        
        //Print Out Grades and Make New File
        PrintWriter writer = new PrintWriter(new File(newFileName));
        writer.print(grades);
        writer.close();
                
        //Print Out Other Results
        System.out.println("Number of students: " + numOfStudents);
        System.out.printf("Class Average: %.2f", average);
    }
}
