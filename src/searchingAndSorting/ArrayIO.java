package searchingAndSorting;

import java.util.Scanner;

public class ArrayIO {


    public  int[] inputArray(){
        System.out.println("enter size and array elements ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
