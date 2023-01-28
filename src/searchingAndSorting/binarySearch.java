package searchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayIO a=new ArrayIO();
        int arr[]=a.inputArray();
        System.out.println("enter a number to search");
        int x=sc.nextInt();
        System.out.println(BinarySearch(arr,x));

    }
    public static boolean BinarySearch(int arr[],int x){
        Arrays.sort(arr);
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x==arr[mid]){
                return true;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else high=mid-1;
        }
        return false;
    }
}
