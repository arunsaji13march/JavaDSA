package advanxedJava;

import java.util.Arrays;
import java.util.Scanner;

public class Digital {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        smallest(n);
    }
    public static void smallest(int a){
       int j=0;
        int small[]=new int[10];
        if(a<10){
            System.out.println(a+10);
        }
        for(int i=9;i>1;i--){
            while(a%i==0){
                a=a/i;
                small[j++]=i;
            }
        }
        if(a>10){
            System.out.println("Not Possible");
        }

        for(int i=j-1;i>=0;i--){
            System.out.print(small[i]);
        }

    }
}
