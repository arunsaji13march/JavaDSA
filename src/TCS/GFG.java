package TCS;

import java.util.Scanner;

public class GFG {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        arr=sort012( arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sort012(int nums[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{

                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        return nums;
    }
}
