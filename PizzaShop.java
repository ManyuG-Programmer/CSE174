import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class PizzaShop {
    public static void main(String[] args) throws FileNotFoundException{
        
        //Pizza 1
        Pizza myPizza = new Pizza("small", "stuffed");
        myPizza.addTopping("pepperoni");
        myPizza.setDelivery(true);
        System.out.println(myPizza.toString());
        
        //Pizza 2
        Pizza myPizza2 = new Pizza(5);
        System.out.println(myPizza2.toString());
        
        //Pizza to Test Method
        Pizza myPizza3 = new Pizza(234);
        Pizza myPizza4 = new Pizza(8675);
        System.out.println(pizzaCost(myPizza3));
        System.out.println(myPizza3.getToppings());
        System.out.println(pizzaCost(myPizza4));
        /*
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter order filename: ");
        String fileName = kb.next();
        pizzaOrder(fileName);
        */    
    }
    
    /*
    * This method returns the total
    * pizza cost
    * @param p is a Pizza value
    * @return double
    */  
    public static double pizzaCost(Pizza p) {
        double cost = 0.00;
        String size = p.getSize();
        String crust = p.getCrust();
        
        //Finding out the size and crust
        if (size.equals("small")) {
            cost += 4.00;
            if (crust.equals("stuffed")) {
                cost += 1.00;
            }
        } else if (size.equals("medium")) {
            cost += 5.50;
            if (crust.equals("stuffed")) {
                cost += 2.00;
            }
        } else {
            cost += 7.00;
            if (crust.equals("stuffed")) {
                cost += 3.00;
            }
        }
        
        //Calculating The Toppings
        cost += p.toppingCount() * 0.75;
        if (p.hasTopping("anchovies")) {
            cost += 0.50;
        }
        
        //Find out if there is a delivery
        boolean delivery = p.getDelivery();
        if (delivery && cost < 10.00) {
            cost += 2.00;
        }
        return cost;
        
    } //end of method
    
    public static void pizzaOrder(String fileName){
        Scanner file = new Scanner(new File(fileName));
        //
        try{
            Pizza orderPizza = new Pizza(file.next(),file.next());
            if(file.next().equals("delivery")){
              orderPizza.setDelivery(true);
            }
            else{
              orderPizza.setDelivery(false);
            }
            while(file.hasNext()){
                if(orderPizza.hasTopping(file.next())){
                   throw new IllegalArgumentException();
                }
                else{
                   if(orderPizza.addTopping(file.next()) == false){
                    throw new IllegalArgumentException();
                   }
                   else{
                    orderPizza.addTopping(file.next());
                   }
                }    
            }
            System.out.println("---Toppings---");
            System.out.println(orderPizza.getToppings());
            System.out.println("---Here is your order---");
            System.out.println(orderPizza.getToppings());
            
            file.close();
        }
        catch (Exception e){
            System.out.println("INVALID ORDER. GOOODBYE");
        }
        //        
    }//end of method
} //end of class
