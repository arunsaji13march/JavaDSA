package EXAM;

import java.util.Scanner;

public class extendedString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the index");
        int K=sc.nextInt();
        String ab="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='0' && c<='9'){
                for(int j = 0; j < Integer.parseInt(""+c);j++){
                    ab+=ab;
                }
            }
            if((c>='A' && c<='Z') || (c>='a' && c<='z') ){
                ab+=String.valueOf(c);
            }
        }
        System.out.println(ab);
        System.out.println(String.valueOf(ab.charAt(K+1)));
    }
}
