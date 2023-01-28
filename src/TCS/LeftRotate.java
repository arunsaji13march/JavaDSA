package TCS;

import java.util.Scanner;

public class LeftRotate {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the k value");
        int k=s.nextInt();
        for(int j=0;j<k;j++){
            int first=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=first;
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
