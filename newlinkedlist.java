import java.util.*;

class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    void prepend(Node x){
        if(head == null)
            head = x;
        else{
            x.next = head;
            head = x;
        }
    }
    void append(Node x){
        if(head == null)
            head = x;
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = x;
        }
    }
    void delete(Node x){
        Node current = head;
        if(current == x){
            head = head.next;
        }
        while(current.next != null){
            if(current.next.data == x.data){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }
    void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class doublelinkedlist{
    public static void main(String args[]){
        LinkedList x = new LinkedList();
        x.append(new Node(10));
        x.append(new Node(20));
        x.print();
        x.prepend(new Node(5));
        x.print();
        x.delete(new Node(10));
        x.delete(new Node(20));
        x.print();
    }
}




