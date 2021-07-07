package LinkedList;

import org.w3c.dom.Node;

public class MyLinkedList<E> implements Linked<E>{

    public static void main(String[] args) {
        Linked<String> stringLinked = new MyLinkedList<>();
        stringLinked.addLast("YHI");
        stringLinked.addLast("Yewew");
        System.out.println(stringLinked.getElementByIndex(0));
    }
        private Node<E> frstNode;
        private Node<E> lastNode;
        private int size = 0;

        public MyLinkedList(){
            lastNode = new Node<E>(null, frstNode,null);
            frstNode = new Node<E>(null, null,lastNode);
        }
        public void addLast (E e){
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev,null);
        prev.setNextElement(lastNode);
        size++;
        }
        public void addFirst (E e){

        }
        public int size (){
            return size;
        }
        public E getElementByIndex (int counter){
            Node<E> target = frstNode.getNextElement();
            for (int i = 0; i < counter; i++){
                target = getNextElement(target);
            }
            return target.getCurrentElement();
        }
        private Node<E> getNextElement (Node<E> current){
            return current.getNextElement();
        }
        private class Node<E>{
            private E currentElement;
            private Node<E> nextElement;
            private Node<E> prevElement;

            private Node(E currentElement, Node<E> prevElement, Node<E> nextElement){
                this.currentElement = currentElement;
                this.nextElement = nextElement;
                this.prevElement = prevElement;
            }
            public E getCurrentElement(){
                return currentElement;
            }
            public void setCurrentElement(E currentElement){
            this.currentElement = currentElement;
            }
            public Node<E> getNextElement(){
                return nextElement;
            }
            public void setNextElement(Node<E> nextElement){
                this.nextElement = nextElement;
            }
            public Node<E> getPrevElement(){
                return prevElement;
            }
            public void setPrevElement (Node<E> prevElement){
                this.prevElement = prevElement;
            }
        }
}

