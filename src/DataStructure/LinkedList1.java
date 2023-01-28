package DataStructure;

public class LinkedList1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            this.next=null;
        }
    }
    //add
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addLast(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;

    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node curr=head;
        while(curr !=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]){
        LinkedList1 list=new LinkedList1();
        list.addfirst(22);
        list.addfirst(33);
        list.printList();
        list.addLast(454);
        list.addfirst(5);
        list.addLast(27);

    }

    }

