package Digital;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sample4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                    arr2[j]=-1;
                    arr1[i]=-2;
                }
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

//        for (int i : arr1) {
//            for (int j : arr2) {
//                if (i == j) {
//                    list.add(i);
//                }
//            }
//        }
//        Collections.sort(list, Collections.reverseOrder());
//       // Integer[] a=list.toArray(new Integer[list.size()]);
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.print("]");



    }

    public static void Print(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
