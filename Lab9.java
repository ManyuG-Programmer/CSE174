/**
 * Manyu Ghildiyal.
 * Lab9.java
 * Practicing writing methods.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab9 {
    // main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int option;
        
        do {
            menu();  // Displaying the menu
            try {
                option = in.nextInt();
            } catch (InputMismatchException err) {
                in.next();  // clearing the input
                option = 0; // picking zero as a value for the option
            }
            switch (option) {
                case 1:
                    System.out.printf("Enter a single binary code: ");
                    char letter = getLetter(in.next());
                    System.out.printf("The letter is: %s\n", letter);
                    break;
                case 2:
                    System.out.printf("Enter binary codes: ");
                    String word = getWord(in.next());
                    System.out.printf("The word is: %s\n", word);
                    break;
                case 3:
                    System.out.printf("End!\n");
                    break;
                default:
                    System.out.printf("Invalid Input!\n");
            }
        } while (option != 3);
    }
    
    /*
     * Prints a menu with options on the display.
     */
    private static void menu() {
        System.out.printf("\n**Binary Code Translator v 1.0**\n");
        System.out.printf("1. Translate a binary code into a letter\n");
        System.out.printf("2. Translate binary codes into a word\n");
        System.out.printf("3. Exit\nEnter a number [1-3]: ");
    }
    
    /*
    * This method converts a binary string into a character
    * @ param letter a String value
    * @ return the converted binary to char
    */
    
    public static char getLetter(String letter) {
        //Goes through String Length
        int letterAt = 0;
        //What power we are at
        int powerCounter = 7;
        //Total Sum
        int totalSum = 0;
        
        while (letterAt < letter.length()) {           
            if (letter.charAt(letterAt) == '1') {
                totalSum += 1 * Math.pow(2, powerCounter);
            } else {
                totalSum += 0;
            }
            powerCounter--;
            letterAt++;
        }
        char answer = (char) totalSum;
        return answer;
    }
    
    /*
    * This method converts a binary string into a word
    * @param word a String value
    * @return a converted binary to a word
    */
    
    public static String getWord(String word) {
        //Goes through String Length
        int letterAt = 0;
        //What power we are at
        int powerCounter = 7;
        //Total Sum
        int totalSum = 0;
        String totalWord = "";
        
        while (letterAt < word.length()) {         
            if (word.charAt(letterAt) == '1') {
                totalSum += 1 * Math.pow(2, powerCounter);
            } else {
                totalSum += 0;
            }
            powerCounter--;
            letterAt++;
            if (powerCounter < 0) {
                char convertor = (char) totalSum;
                totalWord += convertor;
                powerCounter = 7;
                totalSum = 0;
            }  
        }

        return totalWord;
    }
}
