package EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1");
        String str=sc.nextLine();
        System.out.println("Enter String1");
        String str1=sc.nextLine();
        if(str.length()!=str1.length()){
            System.out.println("No");
        }

        char c1[]=str.toCharArray();
        char c2[]=str1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean flag=true;
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                flag=false;
                break;
            }

        }
        if (flag==false){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");

        }
    }
}
