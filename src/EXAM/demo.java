package EXAM;

import java.util.Scanner;

public class demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the index");
        int K=sc.nextInt();
        String ab="";
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<'9'){
                for (int j=0;j<Integer.parseInt(""+str.charAt(i));j++){
                    ab+=ab;
                }
            }
            if((str.charAt(i)>='A' && str.charAt(i)<='Z') ||(str.charAt(i)>='a' && str.charAt(i)<='z')){
                ab=ab+str.charAt(i);
            }

        }
        System.out.println(ab.charAt(K+1));
    }
}
