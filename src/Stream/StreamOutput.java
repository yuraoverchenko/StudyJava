package Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StreamOutput {
    public static void main(String[] args) {

        FileWriter fr = null;
        String string = "Yura Overchenko";
        File file = new File("D:/2.txt");


            try {
                fr = new FileWriter(file, true);
                fr.write(string);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}


