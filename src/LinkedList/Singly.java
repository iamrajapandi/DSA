package LinkedList;
public class Singly {

    class Node {
        int data;
        Node nxt;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    public void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.nxt = n;
            tail = n;

        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + "");
            n = n.nxt;

        }
    }

    public void delete(int key) {
        Node n = head, pre = null;
        if (n.data == key) {
            head = n.nxt;
        }
        while (n.data != key) {
            pre = n;
            n = n.nxt;
        }
        pre.nxt = n.nxt;
    }

    public static void main(String[] args) throws Exception {

        Singly s = new Singly();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.delete(20);
        s.display();
        System.out.println("Hello, World!");
    }

}
