import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.SplittableRandom;

public class Collection {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("c:/винница.txt");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);
        String text = new String(data);

        ArrayList<String[]> linewords = new ArrayList<>();
        String[] lines = text.split("\n");
        for (String line : lines) {
            String[] words = line.split(",");
            linewords.add(words);
        }
        for (String[] words : linewords) {
            if (words[0].equals("вава")) {
                for (String word : words) {
                    System.out.println(word);
                    System.out.print("!");
                }
                System.out.println("_____________________________");
            }
        }
    }
}

