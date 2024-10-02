import java.util.*;

/**
 * stringaddend
 */
public class stringaddend {
    public static void addend(String str, int count, int idx, String newStr) {
        if (str.length() == idx) {
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            addend(str, count, idx + 1, newStr);
        } else {
            newStr += currchar;
            addend(str, count, idx + 1, newStr);
        }

    }

    public static void main(String arg[]) {
        String str = "adbxbxixixb";
        String newStr = "";
        addend(str, 0, 0, newStr);
    }
}