import java.util.Scanner;

/*
* Name: Manyu Ghildiyal
* Lab 10
* 10/29/2021
*/
public class Lab10 {
    public static void main(String[] args) {
        boolean stayInMainLoop = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Name Formatter");
        while (stayInMainLoop) {
            System.out.println("Select an Option!");
            System.out.println("1. Only First Name");
            System.out.println("2. First Name, and Last Name");
            System.out.println("3. First Name, Middle Initial, and Last Name");
            System.out.println("4. First Name, Middle Name, and Last Name");
            System.out.println("5. Exit");
            int answer = input.nextInt();
            switch (answer) {
                default: System.out.println("Different # plz");
                         break;
                case 1: System.out.print("Please enter the name" 
                        + " parts separated by a space: ");
                        formatName(input.next());
                        break;
                case 2: System.out.print("Please enter the name" 
                        + " parts separated by a space: ");
                        formatName(input.next(), input.next());
                        break; 
                case 3: System.out.print("Please enter the name" 
                        + " parts separated by a space: ");
                        formatName(input.next(), input.next().charAt(0), 
                            input.next());
                        break;
                case 4: System.out.print("Please enter the name" 
                        + " parts separated by a space: ");
                        formatName(input.next(), input.next(), input.next());
                        break;
                case 5: System.out.println("Thank You for using" 
                        + " the Name Formatter!");
                        stayInMainLoop = false;
                        break;
            }
        }
    }
    
    /*
    * This method returns the first name
    * @param firstName is a String value
    * @return nothing
    */
    public static void formatName(String firstName) {
        System.out.printf("%-8s\n", firstName);
    }
    
    /*
    * This method returns the first name
    * @param firstName is a String value
    * @param lastName is a String value
    * @return nothing
    */
    public static void formatName(String firstName, String lastName) {
        System.out.printf("%-8s" + " " + "%-8s\n", firstName, lastName);    
    }
    
    /*
    * This method returns the first name
    * @param firstName is a String value
    * @param middleName is a char value
    * @param lastName is a String value
    * @return nothing
    */    
    public static void formatName(String firstName, 
        char middleName, String lastName) {
        System.out.printf("%-8s"  + " ", firstName); 
        String convert = middleName + ".";
        System.out.printf("%-8s" + " " +  "%-8s\n", convert, lastName); 
    }
    
    /*
    * This method returns the first name
    * @param firstName is a String value
    * @param middleName is a String value
    * @param lastName is a String value
    * @return nothing
    */ 
    public static void formatName(String firstName, 
        String middleName, String lastName) {
        System.out.printf("%-8s" + " " +  "%-8s" + " " +  "%-8s\n",
            firstName, middleName, lastName);    
    
    }
}
