package fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class CreactFile {


    public static void main(String arg[]){
        try{
         File myfile = new File("file1.txt");
         FileWriter fileWriter = new FileWriter("file1.txt");
         fileWriter.write("bjfdbjfdjvdvdvd");
        // Scanner sc= new Scanner(myfile);
        // System.out.println(sc.nextLine());
        // while (sc.hasNextLine()) {
        //     String line
        // }

        // // fileWriter.write("Ravi I Love you"); 
        // fileWriter.close();
        // System.out.println("Succ");

     }catch(IOException e){
        System.out.println(e);
     }

     }
}
