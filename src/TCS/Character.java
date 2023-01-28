package TCS;

import java.util.Scanner;

public class Character {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=count(arr);
        System.out.println("vowels count= "+c);
    }
    public static int count(int arr[]){
        int count=0;
        char ch[]=new char[arr.length];
        for(int i=0;i<arr.length;i++){
            ch[i]=(char)arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
                count=count+1;
            }
        }

        return count;
    }
}
