import java.util.*;

class Node {
    String data;
    Node next;
    public Node(String x, Node x1){
        data = x;
        next = x1;
    }
}

class Linkedlist {
    Node head;
    Linkedlist(){
        head = null;
    }
    void Addnode(Node newNode){
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void printNodes(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    void delete(){
        head = head.next;
    }

    boolean search(Node searchNode) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == searchNode.data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

}



public class ran{
    public static void main(String args[]){
        
    }
}

// 12th of December ==> have to submit grade 
