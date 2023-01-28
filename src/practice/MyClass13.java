package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyClass13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        List<Integer> l=validScores(list);
        if(l.isEmpty()==true){System.out.println("No valid score found");}
        else{
            for (int i=0;i<l.size();i++){
                System.out.println(l.get(i));
            }
        }


    }
    public static boolean validateScore(int x){
      if(x>0 && x<=100){
          return true;
      }
      else {
          return false;
      }
    }

    public static List validScores(List<Integer> list){
        List<Integer> l= new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            boolean a= validateScore(list.get(i));
            if(a==true){
                l.add(list.get(i));
            }
        }
        return l;

    }
}