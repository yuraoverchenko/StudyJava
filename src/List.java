public class List {
        Node head = new Node();

         public void add (int value) {

             Node element = new Node(value);
             Node walker = head;
             while (walker.next != null) {
                 walker = walker.next;
             }
             walker.next = element;
         }

        public Integer getSize(){
             int size=0;
            Node walker=head;
            while(walker.next!=null){
            walker=walker.next;
            size++;
            System.out.println(size);
        }
        return size;

    }
         public void print(){
             Node walker = head;
             while (walker.next != null){
                 walker = walker.next;
                 System.out.println(walker.value);
             }
         }
}

