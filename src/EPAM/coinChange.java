package EPAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class coinChange {
    public static void findmin(int v){
        int arr[]={2,2000,5,10,20,500,100,50,1};
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(v>=arr[i]){
                v=v-arr[i];
                list.add(arr[i]);
            }
        }
        for (int i:list) {
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        int v=49;
        findmin(v);
    }
}
