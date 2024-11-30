import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DiscountCalculator {
    public static void main(String[] args) {
        Logger.getGlobal().setLevel(Level.OFF);
    
        //Printing out the prerequisties
        System.out.println("*Discount Calculator*");
        System.out.println("1. Calculating dog discount");
        System.out.println("2. Calculating cat discount");
        System.out.println("3. Calculating rodent discount");
        
        //Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number [1, 2, 3]: ");
        int discountnum = in.nextInt();
        Logger.getGlobal().info("Chosen Number: " + discountnum);
        System.out.print("Enter total purchase: ");
        double purchase = in.nextDouble();
        Logger.getGlobal().info("Purchase: " + purchase);

        
        //Declaring variables for if statement
        double discount = 0.0;
        double total = 0.0;
        
        if (purchase > 100.0) {
            if (discountnum == 1) {
                discount = purchase * 0.2;
                Logger.getGlobal().info("Calculated Discount: " 
                    + discount);                
                Logger.getGlobal().info(
                    "Discount is calculated by taking Purchase Amount *0.2");
                System.out.printf("Dog discount (20%%): %.2f\n", discount); 
                total = purchase - discount;
                Logger.getGlobal().info("Calculated Total: " + total);
                Logger.getGlobal().info(
                    "How Total is calculated:"
                    + "total = Purchase Amount - Discount");
                System.out.printf("Price Payable: %.2f\n", total);    
            } else if (discountnum == 2) {
                discount = purchase * 0.15;
                Logger.getGlobal().info("Calculated Discount: " + discount);
                Logger.getGlobal().info(
                    "Discount is calculated by taking Purchase Amount *0.15");
                System.out.printf("Cat discount (15%%): %.2f\n", discount);
                total = 
                    purchase - discount;                
                Logger.getGlobal().info(
                    "Calculated Total: " + total);                
                Logger.getGlobal().info(
                    "How Total is calculated:" 
                    + "total = Purchase Amount - Discount");
                System.out.printf("Price Payable: %.2f\n", total);
            } else if (discountnum == 3) {
                discount = purchase * 0.12;                
                Logger.getGlobal().info(
                    "Calculated Discount: " + discount);                
                Logger.getGlobal().info(
                    "Discount is calculated by taking Purchase Amount *0.12");
                System.out.printf("Cat discount (12%%): %.2f\n", discount);
                total = purchase - discount;                
                Logger.getGlobal().info(
                    "Calculated Total: " + total);                
                Logger.getGlobal().info(
                    "How Total is calculated:" 
                    + "total = Purchase Amount - Discount");
                System.out.printf("Price Payable: %.2f\n", total);
            } else {                
                System.out.println("You have not input a valid number.");    
                Logger.getGlobal().info(
                    "Calculated Discount: " + discount);        
                Logger.getGlobal().info("Purchase: " + purchase);
                Logger.getGlobal().info("Calculated Discount: " + discount);
                Logger.getGlobal().info("Calculated Total: " + total);
            }
        
        } else {
            discount = purchase * 0.1;    
                        
            Logger.getGlobal().info("Calculated Discount: " + discount);
            Logger.getGlobal().info(
                "Discount is calculated by taking Purchase Amount *0.1");
            total = purchase - discount;
            Logger.getGlobal().info("Calculated Total: " + total);
            Logger.getGlobal().info(
                "How Total is calculated: total = Purchase Amount - Discount");
            
            if (discountnum == 1) {
                System.out.printf("Dog discount (10%%): %.2f\n", discount);
                System.out.printf("Price Payable: %.2f\n", total);    
            } else if (discountnum == 2) {
                System.out.printf("Cat discount (10%%): %.2f\n", discount);
                System.out.printf("Price Payable: %.2f\n", total);
            } else if (discountnum == 3) {
                System.out.printf("Rodent discount (10%%): %.2f\n", discount);
                System.out.printf("Price Payable: %.2f\n", total);
            } else {
                System.out.println(
                    "You have not input a valid selection number.");    
            }
            
        
        }
        
        System.out.println("End");    
    }
}
