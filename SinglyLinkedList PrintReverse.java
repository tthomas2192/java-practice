/*
    Terrence Thomas
    12-29-2021
*/

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

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}

class Result {

    public static void reversePrint(SinglyLinkedListNode llist) {

    int counter = 0;
    SinglyLinkedListNode node = llist;

    if(node != null && node.next != null){
        // Count the size of our Singly Linked List
        while (node.next != null){
            counter++;
            node=node.next;
        }
        node = llist; // reset the list after counting
        if(counter == 0){
            System.out.println(node.data);
        }else{
            // Print the last node on each iteration through the decrementing loop
            while(counter>=0){
                for(int i=0; i<counter;i++){
                    node = node.next;
                }   
                System.out.println(node.data);
                node = llist;   // reset the node reference
                counter--;
                }   
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    }
}
