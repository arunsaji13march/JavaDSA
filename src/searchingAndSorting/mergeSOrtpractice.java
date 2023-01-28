package searchingAndSorting;

import java.util.Scanner;

public class mergeSOrtpractice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        mergeSOrtpractice demo=new mergeSOrtpractice();
        demo.divide(arr);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public void divide(int arr[]){
        int size=arr.length;
        if(size<2){
            return;
        }
        int mid=size/2;
        int left[]=new int[mid];
        int right[]=new int[size-mid];
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        int j=0;
        for(int i=mid;i<size;i++){
            right[j++]=arr[i];
        }
        divide(left);
        divide(right);
        conquer(arr,left,right);
    }
    public void conquer(int arr[],int left[],int right[]){
        int leftsize=left.length;
        int rightsize=right.length;
        int i=0,j=0,k=0;
        while(i<leftsize && j<rightsize){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;k++;
            }
            else{
                arr[k]=right[j];
                j++;k++;
            }
        }
        while (i<leftsize){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<rightsize){
            arr[k]=right[j];
            j++;k++;
        }
    }
}
