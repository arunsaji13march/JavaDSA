package EPAM;

import java.util.Scanner;

public class Amstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int r=0,digit=0,sum=0;
        while (temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            r=temp%10;
            sum=sum+(int)(Math.pow(r,digit));
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Amstrong");
        }
        else System.out.println("Not amstrong");
    }
}
