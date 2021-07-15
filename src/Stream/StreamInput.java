package Stream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class StreamInput {
    public static void main(String[] args) {
        FileInputStream stream = null;
        int b = 0;
        try {
            stream = new FileInputStream("D:/1.txt");
            try {
                while ((b = stream.read()) != -1) {
                    System.out.println((char) b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
