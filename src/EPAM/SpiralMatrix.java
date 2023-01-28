package EPAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//    L   R
//  T[1,2,3]
//   [4,5,6]
//  B[7,8,9]
//123 row d=0
//69  col d=1
//87  row d=2
//4   col d=3

//output=[1,2,3,6,9,8,7,4,5]

public class SpiralMatrix {

    public static List<Integer> spiral(int arr[][]){
        List<Integer> list=new ArrayList<Integer>();
        int row=arr.length;
        int col=arr[0].length;
        if(row==0){
            return list;
        }
        int l=0,r=col-1,t=0,b=row-1;
        int d=0;
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    list.add(arr[l][i]);
                }
                d=1;t++;
            }
            else if(d==1){
                for(int i=t;i<=b;i++){
                    list.add(arr[i][r]);
                }

                d=2;r--;
            }
            else if(d==2){
                for(int i=r;i>=l;i--){
                    list.add(arr[b][i]);
                }

                d=3;b--;
            }
            else if(d==3){
                for(int i=b;i>=t;i--){
                    list.add(arr[i][l]);
                }
                d=0;    b++;

            }
        }


        return list;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        List<Integer> list= spiral(arr);

        System.out.print("[");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.print("]");

    }
}
