package Greedy.problem2;
//Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
//        Note: Unlike 0/1 knapsack, you are allowed to break the item.
//
//
//
//        Example 1:
//
//        Input:
//        N = 3, W = 50
//        values[] = {60,100,120}
//        weight[] = {10,20,30}
//        Output:
//        220.00
//        Explanation:Total maximum value of item
//        we can have is 240.00 from the given
//        capacity of sack.
//        Example 2:
//
//        Input:
//        N = 2, W = 50
//        values[] = {60,100}
//        weight[] = {10,20}
//        Output:
//        160.00
//        Explanation:
//        Total maximum value of item
//        we can have is 160.00 from the given
//        capacity of sack.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Item{
    int value;
    int weight;
    Item(int x,int y){
        this.value=x;
        this.weight=y;
    }

}
public class CFG {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size N ");
        int N=sc.nextInt();sc.nextLine();
        System.out.println("Enter capacity W ");
        int W=sc.nextInt();sc.nextLine();
        Item arr[]=new Item[N];
        System.out.println("enter values and corresponding weight");
        for(int i=0;i<N;i++){
            int v=sc.nextInt();
            int w=sc.nextInt();
            arr[i]=new Item(v,w);
        }
        Solution s=new Solution();
        double result=s.fractionalKnapsack(W,arr,N);
        System.out.println(result);
    }

}
class iterateComparator implements Comparator<Item> {
    public int compare(Item a,Item b){
        double r1=(double)(a.value)/(double)(a.weight);
        double r2=(double)(b.value)/(double)(b.weight);
        if(r1<r2) return 1;
        else if(r1>r2) return -1;
        else return 0;

    }
}


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,new iterateComparator());
        int currw=0;
        double finalv=0.0;
        for(int i=0;i<n;i++){
            if(currw+arr[i].weight<=W){
                currw +=arr[i].weight;
                finalv+=arr[i].value;
            }
            else{
                int remain=W-currw;
                finalv +=((double)arr[i].value/(double)arr[i].weight)*(double)remain;
                break;
            }
        }
        return finalv;

    }
}

