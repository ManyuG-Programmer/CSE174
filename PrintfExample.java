import java.lang.Math;

class PrintfExample {

    public static void main(String[] args) {
    
        String name = "Steven";
        int age = 22;
        
        //compute the hypotenuse of a triangle
        double leg1 = 3.1;
        double leg2 = 4.0;
        double hypot = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        
        //Print out the legs and hypotenuse of the triangle: println and printf (with spacing)
        //System.out.println("With legs " + leg1 + " and " + leg2 + ", the hypotenuse is " + hypot + ".");
        System.out.printf("With legs %7.2f and %.2f, the hypotenuse is %5.4f.%n", leg1, leg2, hypot);
        
        //Printing out PI (3.141592653...) and leg 2 with spacing & justification
        System.out.printf("%-7.2f%n", Math.PI);
        System.out.printf("%7.2f%n", (leg2 + 10)); 

    } //end main

} //end class