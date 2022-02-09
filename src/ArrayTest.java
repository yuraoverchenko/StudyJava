import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("\n");
        System.out.println("Прошло сек1 -" + date.getTime());
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
         System.out.println(list);
         Date date3 = new Date();
        System.out.println("\n");
         System.out.println("Прошло -" + date3.getTime());
        int a = 0;
        while (a < 1000)
        {
            int Rand = (int) (Math.floor(Math.random() * list.get(1000)) + list.get(1));
                System.out.print(Rand + " ");
            a++;

        }
        Date date2 = new Date();
        System.out.println("\n");
        System.out.println("Прошло -" + date2.getTime());
}
}
