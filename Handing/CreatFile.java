
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// public class CreatFile {
//     public static void main(String[] args) throws Exception {
//         File file = new File("abc.txt");
//         file.createNewFile();
//         if (file.exists()) {
//             FileWriter fw = new FileWriter(file);
//             fw.write("Raviraj singh thakur");
//             fw.close();

//             // FileReader fr = new FileReader(file);
//         }
//         FileReader fr = new FileReader(file);
//         BufferedReader br = new BufferedReader(fr);
//         System.out.println(br.readLine()br.readLine()
// );
//         br.close();
//     }
// }

public class CreatFile{
    public static void main(String arg[]){
        File file = new File("aa.txt");

    file.createNewFile();

    System.out.println("Crate file succ");
    if(file.exists()){
        FileWriter fw = new FileWriter(file);
        fw.write("hello")
        fw.close();
    }
    }
}