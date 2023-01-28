package ApnaCollege;

import TCS.Character;

import java.util.*;

public class countOfDuplictes {
    public static void main(String args[]){
        String s="hello world My name is Arun";
        s=s.toUpperCase();
        LinkedHashMap<String ,Integer> map=new LinkedHashMap<String,Integer>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(""+s.charAt(i),1);
            }
            else{
                map.put(""+s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
//        for (Map.Entry mapel:map.entrySet()) {
//            String key=(String) mapel.getKey();
//            int val=(int)mapel.getValue();
//            if(val>1){
//                System.out.println(key+": "+val);
//            }
//        }
            System.out.println(map);
    }
}
