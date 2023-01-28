package EXAM;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        System.out.println("enter size and array elements ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> hashSet = new LinkedHashSet<>();
        for (int i :arr) {
            hashSet.add(i);
        }

        System.out.println(hashSet);

    }
}