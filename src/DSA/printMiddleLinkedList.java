package javaPrograms.DSA;

public class printMiddleLinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void pushElement(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.print("Null"+"\n");
    }

    public int getLen(){
        int len=0;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }

    public void printMiddle(){
        int len=getLen();
        Node temp=head;
        for(int i=0;i<len/2;i++){
            temp=temp.next;
            i++;
        }
        System.out.println("Middle of the list is "+temp.data);
    }


    public static void main(String args[]){
        printMiddleLinkedList list =new printMiddleLinkedList();
        list.pushElement(10);
        list.pushElement(50);
        list.pushElement(35);
        list.pushElement(12);
        list.pushElement(78);
        list.pushElement(22);
        list.printList();
        list.printMiddle();
    }


}
