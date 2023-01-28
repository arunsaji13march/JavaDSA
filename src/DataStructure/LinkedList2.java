package DataStructure;

public class LinkedList2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void addLast(int d){
        LinkedList2.Node newNode=new LinkedList2.Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        LinkedList2.Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;

    }
    //add
    public void addfirst(int data){
        LinkedList2.Node newNode=new LinkedList2.Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public Node reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return head;
    }
    public void printList1(){
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

    public static void main(String args){
        LinkedList2 list4=new LinkedList2();
        list4.addfirst(1);
        list4.addLast(2);
        list4.addLast(3);
        list4.addLast(4);
        list4.addLast(5);
        list4.printList1();
        list4.reverse();
        list4.printList1();
    }
}
