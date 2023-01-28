package searchingAndSorting;

import java.time.chrono.MinguoEra;

public class sortingAlgo {
    public static int[] bubblesort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;
    }
    public static int[] SelectionSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void  MergeSort(int arr[]){
        int inputLength=arr.length;
        if(inputLength<2){
            return;
        }
        int mid=inputLength/2;
        int left[]=new int[mid];
        int right[]=new int[inputLength-mid];

        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<inputLength;i++){
            right[i-mid]=arr[i];
        }
        MergeSort(left);
        MergeSort(right);
        // merge
        merge(arr,left,right);

    }
    public static void merge(int arr[],int left[],int right[]){
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
            i++;
            k++;
        }
        while (j<rightSize){
            arr[k]=right[j];
            j++;
            k++;
        }
    }




    public static void main(String args[]){
        ArrayIO a=new ArrayIO();
        int arr[]=a.inputArray();
        a.printArray(arr);
        MergeSort(arr);
        System.out.println("sorted array is ");
        a.printArray(arr);
    }

}
