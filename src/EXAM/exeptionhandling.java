package EXAM;

import java.util.Scanner;

public class exeptionhandling {
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            int tem=n/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
