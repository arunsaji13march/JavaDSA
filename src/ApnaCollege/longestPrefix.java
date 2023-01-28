package ApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class longestPrefix {
    public static void main(String args[]){
        String arr[]={"flower","flour","flow"};
        int size=arr.length;
        if(size==0){
            System.out.println("longest preix is: ");
        }
        else if(size==1){
            System.out.println("longest preix is: "+arr[0]);
        }
        else{
            Arrays.sort(arr);
            String res="";
            for(int i=0;i<size;i++){
                if(arr[0].charAt(i)==arr[size-1].charAt(i)){
                    res=res+arr[0].charAt(i);
                }
                else{
                    break;
                }
            }
            for (String s:arr) {
                System.out.print(s+" ,");
            }
            System.out.println();
            System.out.println("longest preix is: "+res);
        }
    }
}
