package DataStructure;
import java.util.*;
public class linkedlistclass {
    Node head;
    class Node{
        int  data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    public void add(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void search(int d){
        if(head==null){
            System.out.print("empty");
            return;
        }
        Node curr=head;
        int size=0;

        while(curr!=null){
            size++;
            if(curr.data==d){
                System.out.println("found "+d+" in "+size);
            }
            curr=curr.next;
        }

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        linkedlistclass list1= new linkedlistclass();
        list1.add(32);
        list1.add(2);
        list1.add(33);
        list1.add(45);
        list1.search(33);
    }

}
