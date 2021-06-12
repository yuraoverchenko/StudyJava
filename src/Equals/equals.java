package Equals;
public class equals {
        int Code;
        public boolean equals (equals man){
            return this.Code == man.Code;
        }
        public static void main (String[]args){
            equals man1 = new equals();
            man1.Code = 1111222233;
            equals man2 = new equals();
            man2.Code = 1111222233;
            System.out.println(man1.equals(man2));
//Strring
            String s1 = "Сонячна погода";
            String s2 = new String("Сонячна погода");
            System.out.println(s1.equals(s2));
        }
    }
