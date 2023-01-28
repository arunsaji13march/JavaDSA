package searchingAndSorting;

import java.util.Scanner;

public class LINEARSEARCH {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayIO a=new ArrayIO();
        int arr[]=a.inputArray();
        int n=arr.length;
        System.out.println("enter a number to search");
        int x=sc.nextInt();
        System.out.println(linearSearch(arr,x));
    }
    public static boolean linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

}
