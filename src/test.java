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
        Node x = this.head;
        while (x != null)
        {
            System.out.println(x.value);
            x = x.next;
        }
        System.out.println();
    }
}
