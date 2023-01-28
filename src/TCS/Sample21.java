import java.util.Arrays;

/*
import java.util.*;
 public class M{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(a[i]==R){
                System.out.print(i);
            }
        }
    }
}*/
class Sample21 {
    public static void main(String[] args) {

        int arr[]=new int[0];
        for(int i=0;i<10;i++){
            arr= Arrays.copyOf(arr,arr.length+1);
            arr[i]=i;
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        char ch[]=s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            ch[i]
//        }
    }

}

