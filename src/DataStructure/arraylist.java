package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(22);
        al.add(45);
        al.add(44);
        al.add(2);
        al.add(55);
       // Iterator<Integer> itr= al.iterator();
        System.out.println(al);
        al.remove(2);
        Iterator<Integer> itr= al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+",");
        }
    }
}
