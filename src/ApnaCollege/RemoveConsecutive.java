package ApnaCollege;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveConsecutive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int j=0;
        if(c.length<2){
            System.out.println(s);
        }
        for(int i=0;i<c.length;i++){
            if(c[j]!=c[i]){
                    j++;
                c[j]=c[i];
            }
        }
        char arr[]= Arrays.copyOfRange(c,0,j+1);
        String out=new String(arr);
        System.out.println("OUTPUT:  "+out);
    }
}
