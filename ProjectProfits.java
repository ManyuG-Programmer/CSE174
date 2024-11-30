/* 
 * Sep 3, 2021
 * Author: Manyu Ghildiyal
 * Lab 2.2
 */
public class ProjectProfits {

    //Initialized all variables
    //they are static final because
    //they will never change
    //P_I = Predicted Incomes
    //N_O_I = Number of Incomes
    static final float P_I_1 = 2000000f;
    static final float P_I_2 = 2500000f;
    static final float P_I_3 = 3000000f;
    static final float P_I_4 = 4000000f;
    static final float N_OF_I = 4.0f; 
    
    public static void main(String[] args) {
        
        //Created the percentages
        //did not make them final
        //because they are
        //called and changed
        //p=percentages        
        float p1 = 0.051f;
        float p2 = 0.072f;
        float p3 = 0.093f;
        float p4 = 0.112f;
        
        
        //Calculating first year
        float averageOfNextYear = (P_I_1 * p1 + P_I_2 * p2 
            + P_I_3 * p3 + P_I_4 * p4);
        
        averageOfNextYear = averageOfNextYear / N_OF_I;
        
        //Print Result For First Year
        System.out.println("The average profit for the next year: " 
            + averageOfNextYear);
        
        //Change Percentages
        p1 = 0.06f;
        p2 = 0.08f;
        p3 = 0.101f;
        p4 = 0.132f;
        
        //Calculating second year
        float averageOfSecondYear = (P_I_1 * p1 + P_I_2 * p2 
            + P_I_3 * p3 + P_I_4 * p4);
        
        averageOfSecondYear = averageOfSecondYear / N_OF_I;

        //Print Result For Second Year
        System.out.println("The average profit for the second year: " 
            + averageOfSecondYear);
        
        //Change Percentages
        p1 = 0.08f;
        p2 = 0.105f;
        p3 = 0.13f;
        p4 = 0.168f;
        
        //Calculating third year
        float averageOfThirdYear = (P_I_1 * p1 + P_I_2 * p2 
            + P_I_3 * p3 + P_I_4 * p4);
        
        averageOfThirdYear = averageOfThirdYear / N_OF_I;
        
        //Print Result For Third Year
        System.out.println("The average profit for the third year: " 
            + averageOfThirdYear + "\n");
        
        //Calculating total profit
        int totalProfit = (int) (averageOfNextYear) 
            + (int) (averageOfSecondYear) + (int) (averageOfThirdYear);
        
        //Print Result For Total
        System.out.println("Total profit in next 3 years: " + totalProfit);
        
    }
    
    //End Of Program
}
