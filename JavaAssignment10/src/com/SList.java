package com;

public class SList <E>{
    public SNode<E> head;

    public SList (){
        head = new SNode<E>();
    }

    public SListIterator<E> Iterator(){
        return new SListIterator<E> (this);
    }

    public String toString(){
        if(head.element == null){
            return "List is empty";
        }else{
            SNode<E> temp = this.head;
            String s = "Single Linked List ";

            while (temp.next != null){
                s = s + temp.element.toString() + " ";
                temp = temp.next;
            }

            s = s + temp.element.toString();
            return s;
        }
    }
}
