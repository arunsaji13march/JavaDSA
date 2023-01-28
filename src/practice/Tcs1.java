package practice;

import java.util.Scanner;
public class Tcs1
{

    public static void main(String[] args)
    {
        // code to read values
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Bill b[]=new Bill[n];
        for(int i=0;i<n;i++){
            int billno=sc.nextInt();
            String name=sc.nextLine();
            String typeofconnection=sc.nextLine();
            sc.nextLine();
            double billamount=sc.nextDouble();
            sc.nextLine();
            boolean status=sc.nextBoolean();
            b[i]=new Bill(billno,name,typeofconnection,billamount,status);

        }
        sc.nextLine();
        boolean stat=sc.nextBoolean();
        String type=sc.nextLine();
        sc.close();

        // code to call required method
//        practice.Bill out= FindBillWithMaxBillAmountBasedOnStatus(b,stat);
//        System.out.println(out.billno+"#"+out.name);
        // code to display the result
        int count=getCountWithTypeOfConnection(b,type);
        System.out.println(count);
    }

    //code the first method
//    public static practice.Bill FindBillWithMaxBillAmountBasedOnStatus(practice.Bill b[],boolean stat){
//        practice.Bill out=null;
//        double arr[]=new double[0];
//        for(int i=0;i<b.length;i++){
//            if(b[i].status==stat){
//                Arrays.copyOf(arr,arr.length+1);
//                arr[arr.length-1]=b[i].billamount;
//
//            }
//        }
//        //arr=Arrays.sort(arr);
////        for(int i=0;i<arr.length;i++){
////            for(int j=i+1;j< arr.length; j++){
////                double tmp = 0;
////                if (arr[i] > arr[j])
////                {
////                    tmp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = tmp;
////                }
////            }
////        }
//        for(int i=0;i<b.length;i++){
//            if(b[i].billamount==arr[arr.length-1]){
//                out=b[i];
//            }
//        }
//        return out;
//
//    }


    //code the second method
    public static int getCountWithTypeOfConnection(Bill b[],String type){
        int count=0;
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].typeofconnection);
            System.out.println(b[i].status);
            System.out.println(b[i].name);

            if(b[i].typeofconnection.equalsIgnoreCase(type)){
                count++;
                System.out.println(b[i].typeofconnection);
            }
        }
        return count;
    }

}


//code the class
class Bill{
    int billno;
    String name;
    String typeofconnection;
    double billamount;
    boolean status;
    Bill(int billno, String name,String typeofconnection,double billamount,boolean satus){
        this.billno=billno;
        this.name=name;
        this.typeofconnection=typeofconnection;
        this.billamount=billamount;
        this.status=status;
    }

}
