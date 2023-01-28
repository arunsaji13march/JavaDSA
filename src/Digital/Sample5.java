package Digital;

import java.util.Scanner;

public class Sample5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int out[]=new int[n];
       for(int i=0;i<n;i++){
           if(i==0){
               out[i]=-1;
           }


       }
    }
    public static void Print(int arr[]){
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
