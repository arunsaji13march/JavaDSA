package EXAM;

import java.util.Scanner;

//the function number search takes string as input. add the the numbers in the string and divide it by total number of alphablets present in the string
public class NumberSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        double numsum=0;
        double charcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                numsum+=Integer.parseInt(""+str.charAt(i));
            }
            if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
                charcount++;
            }
        }
        System.out.println(Math.round(numsum/charcount));
    }
}
