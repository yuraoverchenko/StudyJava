public class List {
        private MyLinked link;


         public void add (int value){
             MyLinked element = new MyLinked (value);
             element.next = link;
             link = element;
         }
         public void print(){
             MyLinked element = link;


             while (element != null){
                 System.out.println(element.value);
                 element = element.next;

             }
         }
}

