import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class WritingFiles {

    public static void main(String[] args) throws FileNotFoundException {
    
        //We decare our PrintWriter similarly as to how we declare
        //our Scanner for reading in Files
        PrintWriter writer = new PrintWriter(new File("hello.csv"));
        
        //Instead of printing out to the System, we print to the PrintWriter
        writer.println("10,58,68");
        writer.println("cat,dog, 56");
        
        //The PrintWriter will not actually send data to be saved into a file
        //until the file is closed. Until the file is closed, any data printed
        //to the writer will sit in a temporary buffer
        writer.close();
        
    } //end main
    
} //end class