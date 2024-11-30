/**
 * Manyu Ghildiyal.
 * Section: C.
 * Sep 2021.
 * 
 */
 
public class CountTires {
    public static void main(String[] args) {
        //Declare number of tires
        final long NUM_OF_TIRES = 19873123;
        
        //Math to find out Total Tires
        int totalTires = (int) (NUM_OF_TIRES * 2);
        
        //Prints out Number of Tires
        System.out.print("The number of: " + totalTires);
        System.out.println(" tires are added to the production line!");
        
        //Find The Number of Cars That Can Be Made
        int totalCars = totalTires / 4;
       
        //Number of Leftover
        int leftOver = totalTires % 4;
        
        //Print Out Variables
        System.out.println(totalCars + " cars are produced.");
        System.out.println(leftOver + " tires are left.");
    }
} //end of code
