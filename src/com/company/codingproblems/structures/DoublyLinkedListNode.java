package com.company.codingproblems.structures;

public class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int _data){
        this.next = null;
        this.prev = null;
        this.data = _data;
    }
}
