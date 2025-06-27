package ds;

class Node {
    int data;
    Node next;

    public Node(){}

    public Node(int data){
        this.data = data;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    private int len;
    private Node head;

    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        len ++;
    }

    // add last
    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp = head;

        if (head == null){
            head = newNode;
        } else {
            // move the 'temp' to the last position
            while (temp.next != null){
                temp = temp.next;
            }

            // connect the newNode
            temp.next = newNode;
        }

        len ++;
    }

    // add at specific index - 0 based indexing
    public void addAt(int data, int idx){
        Node newNode = new Node(data);

        // when index is invalid
        if (idx < 0 || idx == len) {
            System.out.println("Invalid index.");
            return;
        }

        if (idx == 0){
            addFirst(data);
        } else if (idx == len - 1) {
            addLast(data);
        } else {
            Node temp = head;

            // move the temp to the position before the index
            for (int i = 1; i <= idx-1; i ++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        len ++;
    }

    // delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        } else {
            head = head.next;
        }

        len --;
    }

    // delete last
    public void deleteLast(){
        if (head == null) {
            System.out.println("Linked List is empty!");
            return;
        } else if (len == 1) {
            deleteFirst();
        } else {
            Node temp = head;

            // move the temp to 2nd last position
            while(temp.next.next != null){
                temp = temp.next;
            }

            temp.next = null;
        }

        len --;
    }

    // delete element at specific index
    public void deleteAt(int idx){
        // when index is invalid
        // 0    1   2   3   4   5
        // 10   20  30  40  50  60
        if (idx < 0 || idx == len) {
            System.out.println("Invalid Index.");
        } else if (idx == 0) {
            deleteFirst();
        } else if (idx == len - 1) {
            deleteLast();
        } else {
            Node temp = head;

            for (int i = 1; i <= idx-1; i ++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        len --;
    }

    // get the length of the linked list
    public int getLength(){
        Node temp = head;

        while(temp != null){
            len ++;
            temp = temp.next;
        }
        return len;
    }

    // display all elements in linked list
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.addLast(40);
        list.addLast(50);

        list.addAt(100, 2);

        list.deleteFirst();
        list.deleteLast();
        list.deleteAt(2);

        list.display();
    }
}
