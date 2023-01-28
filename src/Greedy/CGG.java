package Greedy;
//In this problem, you are provided with one room in your company. In this meeting room, there are "N" meetings that need to take place such that only one meeting can take place at a single time. Each meeting has a starting time and an ending time, both of which are provided to you in the form of two arrays(s[] and f[]). Our task here is to find the maximum number of meetings that can take place in this single room without any conflicts based on their starting and end timings.
//        ​Example 1:
//
//        Input:
//        s = [1,4,0,6,9,10]
//        f = [3,5,7,8,11,12]
//        Output:
//        Maximum meetings that can take place are: 4
//        Meetings:
//        A[1,3], B[4,5], D[6,8], E[9,11]
//
//        Example 2:
//        Input:
//        s = [2,5]
//        f = [3,6]
//        Output: Maximum meetings that can take place are: 2
//        Meetings: A[2,3], B[5,6]
//
//        Example 3:
//        Input:
//        s = [1,2]
//        f = [3,5]
//        Output: Maximum meetings that can take place are: 1
//        Meetings: A[1,3]


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CGG {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int t=sc.nextInt();sc.nextLine();
        int start[]=new int[t];
        int end[]=new int[t];
        System.out.println("enter start");
        for(int i=0;i<t;i++){
            start[i]=sc.nextInt();sc.nextLine();
        }
        System.out.println("enter end");
        for(int i=0;i<t;i++){
            end[i]=sc.nextInt();sc.nextLine();
        }
        int ans=new Solution().maxMeetings(start,end,t);
        System.out.println(ans);
    }
}
class meetpair{
    int start,end;
    meetpair(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Solution {
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.

    class comp implements Comparator<meetpair> {
        public int compare(meetpair o1, meetpair o2) {
            if (o1.end > o2.end)
                return 1;
            else if (o1.end < o2.end)
                return -1;
            else if (o1.start > o2.start)
                return 1;
            return 0;

        }
    }

    public int maxMeetings(int start[], int end[], int n) {
        // add your code here
        ArrayList<meetpair> arr = new ArrayList<meetpair>();
        comp Cc = new comp();
        for (int i = 0; i < n; i++) {
            arr.add(new meetpair(start[i], end[i]));
        }

        Collections.sort(arr, Cc);
        int ans = 1;
        int prev = arr.get(0).end;
        for (int i = 1; i < n; i++) {
            if (arr.get(i).start > prev) {
                ans++;
                prev = arr.get(i).end;
            }
        }
        return ans;


    }
}
