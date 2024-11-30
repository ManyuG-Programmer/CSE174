/*
* Name: Manyu Ghildiyal
* Lab: Lab 8 - Char Generator
* 10/15/2021
*/
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        boolean continueLoop = true;
        boolean continueAnswer = true;
        
        do {
            int totalNumber = 0;
            boolean answerWrong = true;
            
            do {
                try {
                    System.out.print("Enter an int number: ");
                    totalNumber = Integer.parseInt(keyboardReader.next());
                    if (totalNumber <= 0) {
                        throw new IllegalArgumentException();
                    } else {
                        answerWrong = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input!");
                } catch (IllegalArgumentException e) {
                    System.out.println("No result with an" 
                        + "input less than or equal to zero!");
                    answerWrong = false;

                }
               
            
            } while (answerWrong);
                     
                       
            for (int columns = 1; columns <= totalNumber; columns++) {
                for (int rows = 1; rows <= totalNumber; rows++) {
                    if (columns % rows == 0) {
                        System.out.print("O");
                    } else {
                        System.out.print("X"); 
                    }
                }
                System.out.print("\n"); 
            }
                
            do {
                System.out.print("Do you want to repeat (y/n)? ");
                String answer = keyboardReader.next();
                if (answer.equalsIgnoreCase("y")) {
                    continueLoop = true;
                    continueAnswer = false;
                } else if (answer.equalsIgnoreCase("n")) {
                    continueLoop = false;
                    continueAnswer = false;
                } else {
                    continueAnswer = true;
                }
                
            } while (continueAnswer);
                
        } while (continueLoop);
        
        System.out.print("End");
    }
}
