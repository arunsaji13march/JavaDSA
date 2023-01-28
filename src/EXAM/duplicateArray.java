package EXAM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class duplicateArray {
    public static void main(String args[]){
        System.out.println("enter size and array elements ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
