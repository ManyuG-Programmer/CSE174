/*
 * Meisam Amjad 
 * CSE 174 Lab 7
 * Provided Code to work with the Debugger
 * This program loops over two numbers, 
 * incrementing a sum at specific conditions.
 */
 
 
public class DebugLab8 {
    public static void main(String[] args) {
 
        int a = 4;
        int b = 5;
        //Original is a Zero
        int sum = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                counter1++;
                sum++;
            }
            for (int j = 0; j <= b; j++) {
                if ( j % 2 == 1 ) {
                    counter2++;
                    sum++;
                }
                for (int k = 0; k < 10; k++) {
                    if (k == i) {
                        counter3++;
                        sum++;
                    }
                    if (k == j) {
                        counter4++;
                        sum++;
                    }
                    System.out.print("");
                }
            }
        } 
        System.out.println(sum);
        System.out.println(counter1);
                System.out.println(counter2);       

        System.out.println(counter3);       

        System.out.println(counter4);       
       
       
       
    }
}
