public class test {
    Node head;
    Node tail;

    public void add(int value) {
        Node i = new Node();
        i.value = value;
        if (tail == null)
        {
            head = i;
        } else {
            tail.next = i;
        }
        tail = i;
    }

    public void print()
    {
        Node i = this.head;
        while (i != null)
        {
            System.out.println(i.value);
            i = i.next;
        }
        System.out.println();
    }
}
