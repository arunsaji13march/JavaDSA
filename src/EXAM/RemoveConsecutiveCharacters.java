package EXAM;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveConsecutiveCharacters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char c[]= str.toCharArray();
        int n=c.length;
        if(n<2){
            return;
        }
        int j=0;
            for(int i=0;i<n;i++){
                if(c[j]!=c[i]){
                    j++;
                    c[j]=c[i];
                }
        }
        System.out.println(Arrays.copyOfRange(c,0,j+1));
    }
}
