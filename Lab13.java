import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab13 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("customer_list.txt");
        Scanner file = new Scanner(inputFile);
            
        int numOfLines = 0;
        while (file.hasNextLine()) {
            numOfLines++;
            file.nextLine();
        }
        
        //System.out.println("There are " + numOfLines + " lines in the file");
        Customer[] listOfCustomers = new Customer[numOfLines];   
        
        Scanner newFile = new Scanner(inputFile);
        int coordinate = 0;
        while (newFile.hasNext()) {
            String nickname = newFile.next();
            long id = newFile.nextLong(); 
            Customer newCustomer = new Customer(nickname, id);
            listOfCustomers[coordinate] = newCustomer;
            coordinate++;
            newFile.nextLine();
        }
        
        /*
        System.out.println("[0]: " + listOfCustomers[0].toString());
        System.out.println("[10]: " + listOfCustomers[10].toString());
        System.out.println("[1000]: " + listOfCustomers[1000].toString());
        System.out.println("[1000000]: " + listOfCustomers[1000000].toString());
        System.out.println("[last index]: " 
            + listOfCustomers[numOfLines - 1].toString());
        */
        
        Customer key = new Customer("gwstikg", 100005949);
        Customer key2 = new Customer("mqzhfygjuk", 6001073675L);
        Customer key3 = new Customer("gnv", 7412760286L);
        Customer key4 = new Customer("CSE174", 1111111111L);
       

    }
    
    /*
    * Returns the index of an object
    * in ArrayList of Customer
    * Objects
    * @param arrayOfCustomers is an
    * Customer[] value
    * @param object is an Customer
    * object
    * @return int
    */
    public static int linearSearch(Customer[] arrayOfCustomers,
        Customer object) {
        
        int index = -1;
        int counter = 0;
        for (int i = 0; i < arrayOfCustomers.length; i++) {
            if (arrayOfCustomers[i].equals(object)) {
                index = i;
                counter++;
                break;
            }
            counter++;
        }
        
        System.out.println("Linear Search: The key is found after " + counter 
            + " comparison");
        return index;            
    }
    
    /*
    * Returns the index of an object
    * in ArrayList of Customer
    * Objects
    * @param arrayOfCustomers is an
    * Customer[] value
    * @param object is an Customer
    * object
    * @return int
    */
    public static int binarySearch(Customer[] arrayOfCustomers, 
        Customer object) {
        
        int first = 0; 
        int last = arrayOfCustomers.length - 1;
        int middle = (first + last) / 2;
        
        int index = -1;
        int counter = 0;
        
        while (first <= last) {
            if (arrayOfCustomers[middle].getId() < object.getId()) {
                first = middle + 1;    
            } else if (arrayOfCustomers[middle].equals(object)) {
                index = middle;
                counter++;
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
            counter++;
        }        

        System.out.println("Binary Search: the key is found after " + counter 
            + " comparison");
        return index;            
    }
    
}
