package com.ash.DSImpl;

public class LinkedListImpl {

    Node head;
    Node tail;
    int size;

    public LinkedListImpl(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
        }
    }

    public static void main(String[] args){
        LinkedListImpl list =new LinkedListImpl();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.addFirst(0);

        //list.deleteAtPosition(list,0);
        System.out.println("size of the linked list is:"+list.size());

        System.out.println("My head:"+list.head.data);
        System.out.println("My tail: "+list.tail.data);


        list.printList();

        //list.reverse();

        list.insertInSortedList(7);
        list.insertInSortedList(5);

        list.printList();
        System.out.println("New size:"+list.size);

        list.deleteAlternate();
        System.out.println("Latest size: "+list.size);
        list.printList();


    }
    public boolean isEmpty(){
        return this.size==0;
    }

    //adds a node at the end
    public void insert(int data){

        Node newNode=new Node(data);
        newNode.next=null;

        if(this.head==null){
            this.head=this.tail=newNode;
            size++;
        }
        else{
            Node last=this.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=this.tail=newNode;
            size++;
        }

    }

    public void addFirst(int data){

        Node newNode=new Node(data);
        if (this.head==null){
            this.head=this.tail=newNode;
        }
        else {
            Node temp=this.head;
            this.head=newNode;
            this.head.next=temp;

        }
        size++;
    }

    public void deleteAlternate(){

        Node prev=this.head;
        Node currNode=this.head.next;
        while(currNode!=null){
            prev.next=currNode.next;
            prev=currNode.next;
            currNode=currNode.next.next;

            size--;
        }

    }

    public Node getNodeAtIndex(int index){

        int pos=0;
        Node currNode=this.head;
        if(index==0 && currNode!=null){
            return currNode;
        }
        while(pos!=index && currNode!=null){
            pos++;
            currNode=currNode.next;
        }
        if(pos==index){
            return currNode;
        }
        return null;

    }

    public void reverse(){
        int left=0;
        int right=this.size-1;
        while (left<right){
            Node leftNode=this.getNodeAtIndex(left);
            Node rightNode=this.getNodeAtIndex(right);
            int temp=leftNode.data;
            leftNode.data=rightNode.data;
            rightNode.data=temp;

            left++;
            right--;
        }
    }

    public LinkedListImpl deleteByKey(LinkedListImpl list,int key){

        if(this.head==null)
            return list;
        if(this.head.data==key){
            this.head=this.head.next;
            size--;
            return list;
        }
        Node currNode=this.head;
        Node prev=null;
        while (currNode!=null){
            if(currNode.data==key){
                prev.next=currNode.next;
                size--;
            }
            prev=currNode;
            currNode=currNode.next;
        }
        return  list;
    }

    public LinkedListImpl deleteAtPosition(LinkedListImpl list,int pos){

        if(pos==0){
            this.head=this.head.next;
            size--;
            return list;
        }
        else{
            int index=0;
            Node currNode=this.head;
            Node prev=null;
            while (currNode!=null && pos!=index){
                index++;
                prev=currNode;
                currNode=currNode.next;
            }
            if (pos==index){
                System.out.println("Deleting "+currNode.data+" at index"+index);
                size--;
                prev.next=currNode.next;
            }
            else {
                System.out.println(pos+" Invalid position");
            }
        }
        return list;

    }

    public void insertInSortedList(int d){

        Node newNode=new Node(d);

        if(d<=this.head.data){
            this.addFirst(d);
            size++;
        }

        Node prev=this.head;
        Node currNode=this.head.next;
        while(currNode!=null){
            if(prev.data<=d && currNode.data>=d){
                prev.next=newNode;
                newNode.next=currNode;
                size++;
            }
            prev=currNode;
            currNode=currNode.next;

        }
    }

    public int size( ){
//        int counter=0;
//        Node currNode= this.head;
//        while (currNode!=null){
//            counter++;
//            currNode=currNode.next;
//        }
//        return counter;
        return this.size;
    }

    public void printList(){

        Node current=this.head;
        while (current!=null){
            System.out.println(current.data+",");
            current=current.next;
        }
        System.out.println();
    }
}
