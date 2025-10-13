
public class LinkedList {
    public Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(30);
        list.append(60);
        list.append(90);
        list.display();
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node current = head;

        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null" + '\n');
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}