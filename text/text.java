package text;

import java.io.BufferedReader;
import java.io.FileReader;

public class text {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 5 };
        try (FileReader fr = new FileReader("abc.txt");
                BufferedReader bf = new BufferedReader(fr)) {
            // System.out.println(arr[3]);

            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
    };
}
