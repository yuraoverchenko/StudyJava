import java.util.Date;
import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("\n");
        System.out.println(date.getTime());
        LinkedList<Integer> linked = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linked.add(i);
        }
        System.out.println(linked);
        Date date3 = new Date();
        System.out.println("\n");
        System.out.println("Прошло -" + date3.getTime());
        int a = 0;
        while (a < 1000)
        {
            int Rand = (int) (Math.floor(Math.random() * linked.get(1000)) + linked.get(1));
            System.out.print(Rand + " ");
            a++;

        }
        Date date2 = new Date();
        System.out.println("\n");
        System.out.println("Прошло  тест-" + date2.getTime());
    }
}
