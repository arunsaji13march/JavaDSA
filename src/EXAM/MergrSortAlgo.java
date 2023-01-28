package EXAM;

import java.util.Scanner;

public class MergrSortAlgo {
    public static void main(String args[]){
        System.out.println("enter size and array elements ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Merge(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

    }
    public static void Merge(int arr[]){
//        int arrlength=arr.length;
//        if(arrlength<2){
//            return;
//        }
//        int mid=arrlength/2;
//        int left[]=new int[mid];
//        int right[]=new int[arrlength-mid];
//
//        for(int i=0;i<mid;i++){
//            left[i]=arr[i];
//        }
//        for(int i=mid;i<arrlength;i++){
//            right[i-mid]=arr[i];
//        }
//        Merge(left);
//        Merge(right);
//        Sort(arr,left,right);

        int arrSize=arr.length;
        if(arrSize<2){
            return;
        }
        int mid=arrSize/2;
        int left[]=new int[mid];
        int right[]=new int[arrSize-mid];

        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        int j=0;
        for(int i=mid;i<arrSize;i++){
            right[j++]=arr[i];
        }
        Merge(left);
        Merge(right);
        Sort(arr,left,right);

    }
    public static void Sort(int arr[],int left[],int right[]){
        int leftLength=left.length;
        int rightlength=right.length;

        int i=0,j=0,k=0;
        while(i<leftLength && j<rightlength){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                k++;i++;
            }
            else{
                arr[k]=right[j];
                k++;j++;
            }
        }
        while(i<leftLength){
            arr[k++]=left[i++];
        }
        while(j<rightlength){
            arr[k++]=right[j++];
        }
    }

}
