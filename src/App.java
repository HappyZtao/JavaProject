import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int flag = exceptionFunc("test.txt");
        System.out.println(flag);

    }

    public static int exceptionFunc(String fileName){
        try {
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
        } catch(FileNotFoundException f) { // Not valid!
            f.printStackTrace();
            return -1;
        } catch(IOException i) {
            i.printStackTrace();
            return -1;
        }
        return 0;
    }
}



