package Digital;
// sum with 9 subtracted from each digit
//0<n<1000000
//123345=n

//876654

//public static int method1(int n){
//int n=temp;
//int sum=0;
//while(n>0){
// int rem=n%10;  rem=5,4,3,3,2,1           rem=5,4,3,3,2,1
//sum=sum*10+(9-rem)   sum=456678         =543321
//n=n/10;    n=12334,1233,                  n=12334,1233,123,12,1,0
// }
//n=sum
//sum=0;
//sum=456678
//while (sum>10){
////int out=0;
//while(n>0){ n=456678
// int rem=n%10;      rem=8,7,6,6,5,4              rem=5,4,3,3,2,1           rem=5,4,3,3,2,1
//sum=sum*10+(rem)    sum=876654              sum=456678         =543321
//n=n/10;
// }
// }



import java.util.Scanner;

public class sample1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0 && n>1000000){
            System.out.println("wrong input ");
        }
        else{
            int out=reverseminus9(n);
            System.out.println(out);
        }
    }
    public static int reverseminus9(int n){
        int modified=0,out=0;
        while(n>0){
            int rem=n%10;
            modified=modified*10+(9-rem);
            n=n/10;
        }
        while(modified>0){
            int rem=modified%10;
            out=out*10+rem;
            modified=modified/10;
        }
        return out;
    }

}
