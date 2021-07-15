package Stream;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreaminCollection<x> {
    public static void main(String[] args) {

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90)
                .limit(3).forEach(System.out::print);
//.....
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Tри");
        list.add("Three");
        list.add("Four");
       Stream stream = list.stream();
       stream.filter(x -> x.toString().length() == 3).forEach(x-> System.out.println(x));
    }
}