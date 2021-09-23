public class List {
    Node head = null;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node walker = head;
            while (walker.next != null) {
                walker = walker.next;
            }
            walker.next = new Node(value);
        }
    }

    public Integer getSize() {
        int size = 0;
        Node walker = head;
        while (walker != null) {
            walker = walker.next;
            size++;
            System.out.println(size);
        }
        return size;
    }

    public void print() {
        Node walker = head;
        while (walker != null) {
            System.out.println(walker.value);
            walker = walker.next;
        }
    }
}
