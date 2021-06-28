package Equals;
public class compare {
        int Code;
        public boolean equals (compare man){
            return this.Code == man.Code;
        }

        public static void main (String[]args){
            compare man1 = new compare();
            man1.Code = 1111222233;
            compare man2 = new compare();
            man2.Code = 1111222233;
            System.out.println(man1.equals(man2));

//Strring
            String s1 = "Сонячна погода";
            String s2 = new String("Сонячна погода");
            System.out.println(s1.equals(s2));
        }
    }
