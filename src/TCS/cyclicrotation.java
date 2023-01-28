package TCS;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.arraycopy;

public class cyclicrotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter K ");
        int k = sc.nextInt();
        int arr1[] = new int[k];
        for(int i=0;i<n-k;i++){
            arr1[i]=arr[i];
        }
       int arr2[]=new int[n-k];
        int count=0;
        for(int i=0;i<k;i++){
            arr2[i]=arr[arr.length-1-count];
            count++;
        }
        arr1=rvereseArray(arr1,0,arr1.length);
        arr2=rvereseArray(arr2,0, arr2.length);
        arraycopy(arr2,0,arr,0,arr2.length);
        arraycopy(arr1,0,arr,arr2.length-1,arr1.length);
        for (int i: arr) {
            System.out.print(i+", ");
        }

    }
    static int[] rvereseArray(int arr[],
                             int start, int end)
    {
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
