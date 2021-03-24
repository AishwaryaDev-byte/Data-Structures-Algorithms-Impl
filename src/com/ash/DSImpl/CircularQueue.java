package com.ash.DSImpl;

public class CircularQueue {

    int maxCapacity=5;
    int[] queue=new int[maxCapacity];
    int front;
    int rear;

    public CircularQueue(){
        this.front=this.rear=-1;
    }

    public boolean isEmpty(){
        return this.front==-1;
    }

    public boolean isFull(){
        return (rear+1)%maxCapacity==front;
    }

    public void display(){

        int i=front;
        while(i!=rear){
            System.out.println(queue[i]);
            i=(i+1)%maxCapacity;
        }
        System.out.println(queue[rear]);
    }

    public void enqueue(int data){

        if(this.isEmpty()){
            this.front=this.rear=0;
            queue[front]=data;
        }
        else if (this.isFull()){
            System.out.println("Queue is fullllll>>>>>>");
        }
        else {
            rear=(rear+1)%maxCapacity;
            queue[rear]=data;
        }
    }

    public void dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty>>>>>>>");
        }
        else {
            this.front=(front+1)%maxCapacity;
        }
    }


}
