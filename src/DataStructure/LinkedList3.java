package DataStructure;

class LinkedList3{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        System.out.println("deleted first "+head.data);
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        Node temp=head;
        Node ptr=temp.next;
        while(ptr.next!=null){
            ptr=ptr.next;
            temp=temp.next;
        }
        System.out.println("deleted Last "+ptr.data);
        temp.next=null;
    }
    public  void deletePosition(int pos){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        Node temp=head;
        Node ptr=temp.next;
        for(int i=1;i<pos;i++){
            if(ptr.next==null){
                System.out.println("No position");
                return;
            }
            temp=temp.next;
            ptr=ptr.next;
        }
        System.out.println("deleted at "+pos+" the data wAS "+ptr.data);
        temp.next=ptr.next;

    }
    public void printdata(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        LinkedList3 list = new LinkedList3();
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(33);
        list.insertFirst(55);
        list.insertLast(45);
        list.insertLast(1);
        list.insertLast(4);
        list.insertLast(144);
        list.printdata();
        list.deleteFirst();
        list.deleteLast();
        list.printdata();
        list.deletePosition(3);
        list.printdata();
    }
}