package com.ash.DSImpl;

public class StackImpl {
    Node top;
    int size;

    class Node{
        int data;
        Node link;
    }

    public StackImpl(){
        this.top=null;
        this.size=0;
    }

    public static void main(String[] args){

        StackImpl s=new StackImpl();
        System.out.println("Initial stack size ==>> "+s.size);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("After push operation the size is ==>> "+s.size);
        s.display();
        s.pop();
        s.pop();
        s.display();
        System.out.println("After pop operation the size ==>> "+s.size);

    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public void push(int d){
        Node newNode=new Node();
        newNode.data=d;

        newNode.link=top;
        this.top=newNode;
        this.size++;

    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }

        this.top=this.top.link;
        this.size--;
    }

    public int peek(){
        if(!this.isEmpty()){
            return this.top.data;
        }
        else
            return -1;
    }

    public void display(){
        if(this.isEmpty()){
            return;
        }
        Node currNode=this.top;
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.link;
        }System.out.println();
    }

}
