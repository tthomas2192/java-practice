import java.io.*;
import java.util.*;

public class Solution {
    // Node Struct
    static class Node{
        int data;
        Node next;
        // Constrcutor initalizes the data value
        Node(int d){data=d;next=null;}
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        LinkedList<Node> list = new LinkedList<Node>();
        while(scanner.hasNext()){
            list.addFirst(new Node(scanner.nextInt()));
        }
        list.forEach((node)->{System.out.println(node.data);});
    }
}
