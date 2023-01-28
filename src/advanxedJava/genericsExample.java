package advanxedJava;

import java.util.HashMap;
import java.util.Scanner;

public class genericsExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                int cnt=map.get(c);
                map.put(c,cnt++);
            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0;i<map.size();i++){
        }
    }
}
