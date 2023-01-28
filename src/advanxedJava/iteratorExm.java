package advanxedJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorExm {
    List<String> a=new ArrayList<String>();
    public void addData(){
        a.add(new String("Hyderabad"));
        a.add(new String("Chennai"));
        a.add(new String("Goa"));
        a.add(new String("Mumbai"));
    }
    public void retrieveData(){
        Iterator<String> itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static void main(String args[]){
            //iteratorExm iteratorExm


    }
}
