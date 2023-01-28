package DataStructure;

public class LL2 extends LinkedList1 {
    public void deleteLast(){
        if(head==null){
            System.out.println("empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        Node curr=head.next;//if head.next=null
        Node prev=head;
        while(curr.next !=null){
            curr=curr.next;
            prev=prev.next;
        }
        prev.next=null;

    }
    public void  deleteFirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        head=head.next;
    }
    public  static void main(String args[]){
        LL2 list=new LL2();
        list.addfirst(22);
        list.addfirst(33);
        list.printList();
        list.addLast(454);
        list.addfirst(5);
        list.addLast(27);
        list.printList();
        list.deleteLast();
        list.deleteFirst();
        list.printList();

    }
}
