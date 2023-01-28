package advanxedJava;

import java.util.Scanner;
import java.util.Stack;

public class LIS {
    public static void Print(int arr[]){
        for (int i:arr) {
            System.out.println(i);
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        Stack<Integer> stack = new Stack<Integer>();
//        stack.add(arr[0]);
//        for(int i=0;i<n;i++){
//            for (int j=i+1;j<n-1;j++){
//                if(arr[i]<arr[j] ){
//                    stack.add(arr[j]);
//                    break;
//                }
//            }
//        }
       System.out.println(lis(arr,n));
    }
    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;

        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;

        /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }
}
