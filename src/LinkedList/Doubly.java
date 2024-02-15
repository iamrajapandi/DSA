package LinkedList;

public class Doubly {
    class Node {
        int data;
        Node prev, nxt;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public void insertBegining(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.nxt = head;
            head.prev = n;
            head = n;
        }
    }

    public void inserAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            return;
        } else {
            tail.nxt = n;
            n.prev = tail;
            tail = n.nxt;
        }
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.nxt;

        }
    }

    public static void main(String[] args) {
        Doubly d = new Doubly();
        d.insertBegining(10);
        d.insertBegining(20);
        d.inserAtEnd(30);
        d.display();

    }

}
