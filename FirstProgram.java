//Name: Manyu Ghildiyal
//CSE 174, Section G
//Date: 8/27/2021
//Description: Practice with writing, saving,
//             and compiling code
import java.util.Scanner; //Needed for user input

public class FirstProgram{
   public static void main(String[] args){
      //welcome("Emliy");
      //gameRules("Mary");
      //drawBorder(20);
      
      //Declare local variables
      String first,last;
      int correctNumber, guess, guessCount;
      int triangleSize;
      Scanner keyboardReader = new Scanner(System.in);
      
      //Get user first and last name
      System.out.print("What is your first name and last name?");
      first = keyboardReader.next();
      last = keyboardReader.next();
      
      //Display border and greet
      drawBorder(50);
      welcome(first);
      drawBorder(50);
      
      //Explain the rules
      gameRules(first,last);
      
      //Start the game with a random number
      correctNumber = (int)(1+100*Math.random());
      guessCount=0;
      
      //Get first guess
      guessCount++;
      System.out.print("Enter guess #"+ guessCount+": ");
      guess = keyboardReader.nextInt();
      
      //Loop until guess is correct
      while(guess != correctNumber){
         //Higher or lower
         if(guess < correctNumber){
            System.out.println("Guess is higher");
         }
         else{
             System.out.println("Guess is lower");
         }
         
         //Get next guess
         guessCount++;
         System.out.print("Enter guess #"+ guessCount+": ");
         guess = keyboardReader.nextInt();
      }//end loop
      
      //Print the results
         System.out.println("Congratulations "+ first+ " "+ last+". ");
         System.out.println("You got it in "+ guessCount+" guesses.");
         if(guessCount<=10){
           System.out.println("Your are an excellent guesser. :)");
         }
         else{
           System.out.println("Better luck next time. :(");
         }
       
      //Display Some Art
      System.out.println();
      System.out.println("And now, some stars to make you happy");
      System.out.print("How big do you want the triangle's base to be: ");
      triangleSize  = keyboardReader.nextInt();

      for(int length = triangleSize; length >=1; length--){
         drawBorder(length);
      }
      
      System.out.println("Goodbye");
   }//end main
   
   //Prints a personalized welcome message to the user
   public static void welcome(String name){
      System.out.println("Welcome, "+ name+ ".");
      System.out.println("This is my first CSE 174 programming assignment.");
      System.out.println("Let's play \"Guess My Number\"");
   }//end welcome
   
   //Explains the rules of the game
   public static void gameRules(String name, String name2){
      System.out.println("Are you ready to play a game, "+ name+" "+ name2+"?");
      System.out.println("I will think of a number between 1 and 100.");
      System.out.println("Try to guess in 10 or fewer tries.");
   }//end gameRules
   
   //Draws a border of Asterisks
   public static void drawBorder(int length){
      for(int i=0; i< length; i++){
         System.out.print("*");
      }
      System.out.println();//moves to the next line
   }//end drawBorder
   
}//end Class