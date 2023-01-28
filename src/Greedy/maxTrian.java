//package Greedy;
//
//import java.util.*;
//
//class array1{
//    int no;
//    int arrival;
//    int departure;
//    int platform;
//    array1(int no, int arrival, int departure,int platform){
//        this.no=no;
//        this.arrival=arrival;
//        this.departure=departure;
//        this.platform=platform;
//    }
//}
//
//public class maxTrian {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//       // int[][] arr=new int[m][3];
//        array1 arr[]=new array1[m];
//        for(int i=0;i<m;i++){
//            int no=sc.nextInt();sc.nextLine();
//            int arrival=sc.nextInt();sc.nextLine();
//            int departure=sc.nextInt();sc.nextLine();
//            int platform=sc.nextInt();sc.nextLine();
//            arr[i]=new array1(no,arrival,departure,platform);
//        }
//
//    }
//    public static int maxStops(array1 arr[], int n,int m){
//        Arrays.sort(arr, (array1 a,array1 b) -> a.departure.compareTo(b.departure));
//
//        return count;
//    }
////    class comp implements Comparator<meetpair> {
////        public int compare(meetpair o1, meetpair o2) {
////            if (o1.end > o2.end)
////                return 1;
////            else if (o1.end < o2.end)
////                return -1;
////            else if (o1.start > o2.start)
////                return 1;
////            return 0;
////
////        }
////    }
//
//}
