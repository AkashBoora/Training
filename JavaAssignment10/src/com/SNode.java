package com;

public class SNode <E>{
    E element;
    SNode<E> next;

    SNode(){
        this.element = null;
        this.next = null;
    }
    SNode(E element){
        this.element = element;
        this.next = null;
    }
}
