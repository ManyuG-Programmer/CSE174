import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Don't do this -- it's sloppy
//import java.io.*;

public class ReadingFiles {

   public static void main(String[] args) throws FileNotFoundException {
      
      //Scanner outfitted to read from file "data.txt"
      Scanner kb = new Scanner(new File("data.txt"));
      
      //prints out a prompt to the user, allows them to add their first and last name
      //in the same line seperated by a space
      //System.out.print("Please enter your first and last name: ");
      String fName = kb.next();
      String lName = kb.next();
      
      //prints out a prompt to the user, allows them to add their age
      //System.out.print("Please enter your age: ");
      int age = kb.nextInt();
      
      //prints out a prompt to the user, allows them to add their gpa
      //System.out.print("Please enter your GPA: ");
      double gpa = kb.nextDouble();
      
      System.out.println("Your name is " + fName + " " + lName);
      System.out.println("Your age is " + age + " and GPA is " + gpa);
      
      //To skip data in the file, you can just use kb.next(), but not
      //save the data anywhere. This will read the next data piece
      //converted into a String, then just throw it away
      //kb.next();
      //kb.next();
      //String wanted = kb.next();
      //System.out.print(wanted);
      
      //Always remember to close the file you were reading from!
      //Otherwise, it will be locked to other programs' use
      kb.close();
   
   } //end main

} //end class