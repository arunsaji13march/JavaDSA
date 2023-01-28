package DataStructure;

import java.util.Scanner;

public class stack {
    private int arr[];
    private int top;
    private int capacity;

    stack(int size){
        capacity=size;
        arr=new int[size];
        top=-1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is FUll");
            return;
        }
        else
            System.out.println("inserting ... "+val);
            arr[++top]=val;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else
            System.out.println("Deleting .... "+arr[top]);
            return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println(" Stack is empty ");
        }
        else
            return arr[top];
        return -1;
    }
    public  void print(){
        if(isEmpty()){
            System.out.println("stack is empty ");
            return;
        }
        else
            System.out.println();
            for(int i=top;i>=0;i--){
                System.out.print(arr[i]+", ");
            }
    }

    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int getSize(){
        return top+1;
    }

    public static void main(String args[]){
        stack s=new stack(10);
        s.push(10);
        s.push(20);
        s.push(13);
        s.push(30);
        s.push(32);
        s.push(44);
        s.push(53);
        s.print();
        s.pop();
        s.pop();
        s.print();
        System.out.println("top element is "+s.peek());
        System.out.println("elemrnts in stack  "+s.getSize());


    }


}
