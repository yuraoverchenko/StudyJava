public class List {
        private Node link;


         public void add (int value){
             Node element = new Node(value);
             element.next = link;
             link = element;
         }
         public void print(){
             Node element = link;


             while (element != null){
                 System.out.println(element.value);
                 element = element.next;

             }
         }
}

