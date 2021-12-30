import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

/*  
    Delete Node From Singly Linked List
*/

class Result {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        
    SinglyLinkedListNode temp = llist; // Example  = [1 3 5 7 9]
    
    // pos = 3
    if(position == 0){
        return llist.next; // if pos is zero return list without its head
    }
            
    for(int i=0; temp != null && i<position - 1;i++ ){
        temp = temp.next; // End at temp.next = 5 (i=0 -> 3, i=1 -> 5, i=2 -> break)
    }
            
    if (temp == null || temp.next == null)
            return llist;
            
    // next = 5 to 7 then 9 == 9
    SinglyLinkedListNode next = temp.next.next;
 

    temp.next = next; // Unlink the deleted node from list ( 5 to 7 = 9 ) => llist = [1 3 5 9]
            
    return llist;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
    }
}


