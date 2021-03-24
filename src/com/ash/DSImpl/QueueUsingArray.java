package com.ash.DSImpl;

public class QueueUsingArray {

    int front, rare;
    int maxCapacity=100;
    int[] queue=new int[maxCapacity];

    public QueueUsingArray(){
        this.front=this.rare=-1;
    }

    public static void main(String[] args){
        QueueUsingArray q1=new QueueUsingArray();
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(6);
        System.out.println("front>>"+q1.front+" Rare>>"+q1.rare);

        q1.dequeue();
        System.out.println("front>>"+q1.front+" Rare>>"+q1.rare);

        q1.enqueue(10);
        q1.enqueue(21);
        System.out.println("front>>"+q1.front+" Rare>>"+q1.rare+" front value>>"+q1.peek());

    }

    public boolean isEmpty(){
        return this.front==-1;
    }

    public boolean isFull(){
        return rare-1==maxCapacity;
    }

    public void display(){
        if(!this.isEmpty()){
            for(int i=this.front;i<=rare;i++){
                System.out.println(this.queue[i]);
            }

        }
        else {
            System.out.println("Stack is Empty");
        }
    }

    public int peek(){
        return this.queue[front];
    }

    public void enqueue(int d){
        ++rare;
        if(front==-1){
            queue[++rare]=d;

        }
        else if(rare>this.maxCapacity)
            System.out.println("<<<<<<<<Queue overflowww>>>>>>>");
        else {
            queue[rare] = d;
        }
    }

    public void dequeue(){
        if(this.isEmpty()){
            System.out.println("<<<<<Queue is empty>>>>>");
        }
        else
            front++;
    }


}
