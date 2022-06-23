package com;

public class SListIterator<E> {
    SNode<E> head;
    public SListIterator(SList<E> list) {
        this.head = list.head;
    }

    public void add(E element){
        SNode<E> temp = head;
        if(!this.isEmpty()){
            SNode last = new SNode<E>(element);
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = last;
        }else{
            temp.element = element;
            temp.next = null;
        }
    }

    public void remove(){
        SNode<E> temp = head;
        SNode<E> pre = new SNode<E>();

        if(temp.next == null){
            temp.element = null;
        }else{
            while (temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
        }
    }

    boolean isEmpty(){
        if(head.element == null){
            return true;
        }else {
            return false;
        }
    }
}
