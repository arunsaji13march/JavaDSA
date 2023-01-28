package DataStructure;

import java.util.*;

public class hashmap {
    public static void main(String args[]){
        Map map=new LinkedHashMap();
        map.put(1,"arun");
        map.put(0,"java");
        map.put(3,"code");
        map.put(6,"hash");
        map.put(null,"cav3");
        map.put(88,"lava");
        Set s=map.entrySet();
        System.out.println(map);
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(map.get(6));
        map.put(88,"bava");
        System.out.println(map);
    }
}
