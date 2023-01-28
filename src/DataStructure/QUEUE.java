package DataStructure;

import java.util.Queue;

public class QUEUE {
    int arr[];
    int capacity;
    int rear;
    int front;
    QUEUE(int size){
        arr=new int[size];
        rear=-1;
        front=-1;
        capacity=size;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            if(front==-1){
                front=0;
               // rear=0;
                arr[++rear]=val;
            }
            else {
                arr[++rear]=val;
            }
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }
        else{
            return arr[front++];
        }
    }
    public boolean isFull(){
        if(rear==capacity-1){
            return true;
        }
        else return false;
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void print(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String args[]){
        QUEUE q=new QUEUE(10);
        q.push(12);
        q.push(22);
        q.push(23);
        q.push(44);
        q.push(255);
        q.push(255);
        q.push(55);
        q.print();
        System.out.println(q.pop());
        q.push(72);
        System.out.println(q.pop());System.out.println(q.pop());System.out.println(q.pop());
        q.print();

    }
}
