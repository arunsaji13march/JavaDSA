package searchingAndSorting;

import java.util.Scanner;

public class mergeSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int n=sc.nextInt();
        System.out.println("enter the array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        mergeSortAlgo(arr);
        System.out.println("sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }


    }
    public static void mergeSortAlgo(int arr[]){
        int inputsize=arr.length;
        if(inputsize<2){
            return;
        }
        int mid=inputsize/2;
        int left[]=new int[mid];
        int right[]=new int[inputsize-mid];

        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<inputsize;i++){
            right[i-mid]=arr[i];
        }
        mergeSortAlgo(left);
        mergeSortAlgo(right);
        merge(arr,left,right);
    }
    public static void merge(int [] arr, int[] left, int[] right){
        int leftSize=left.length;
        int rightSize=right.length;

        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            arr[k]=left[i];
            k++;i++;
        }
        while(j<rightSize){
            arr[k]=right[j];
            k++;j++;
        }
    }
}
