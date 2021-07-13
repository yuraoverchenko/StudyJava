package Words;
import java.util.*;

    public class Word {
        public static void main(String[] args) {
            Map<String, Integer> mapa = new LinkedHashMap<String, Integer>();
            for (String string : "юра, дом, дом, дом, собака, собака, собака, собака, map, map, юра".split(", ")) {
                if (mapa.get(string) == null)
                    mapa.put(string, 1);
                else
                    mapa.put(string, mapa.get(string) + 1);

            }
            Integer first = mapa.get("юра");
            System.out.println(first);



            String mapaString = add(mapa.keySet(), ", ");
            ArrayList<Integer> value = new ArrayList<Integer>(mapa.values());

            System.out.println("Слова = " + mapaString);
            System.out.println("Повторення = " + value);

        }

        public static String add(Collection<String> s, String delimiter) {
            StringBuffer buffer = new StringBuffer();
            Iterator<String> iter = s.iterator();
            while (iter.hasNext()) {
                buffer.append(iter.next());
                if (iter.hasNext()) {
                    buffer.append(delimiter);
                }
            }
            return buffer.toString();
        }

    }