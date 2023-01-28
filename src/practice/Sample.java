package practice;

import java.util.PriorityQueue;
import java.util.Scanner;

class Contest{
       int contestId;
       String contestName;
       String contestWinner;
       int points;
       String category;
    Contest (int contestId, String contestName, String contestWinner, int points, String category){
        this.contestId=contestId;
        this.contestName=contestName;
        this.contestWinner=contestWinner;
        this.points=points;
        this.category=category;

    }
    public int getContestId(){ return this.contestId;}
    public String getContestName(){return this.contestName;}
    public String getContestWinner(){return this.contestWinner;}
    public int getPoints(){return this.points;}
    public String getCategory(){return this.category;}
}

public class Sample {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        Contest c[]= new Contest[size];
        for(int i=0;i<size;i++){
            int contestId= sc.nextInt();
            sc.nextLine();
            String contestName=sc.nextLine();
            String contestWinner=sc.nextLine();
            int points=sc.nextInt();
            sc.nextLine();
            String category=sc.nextLine();
            c[i]=new Contest(contestId, contestName,contestWinner,points, category);

        }
        String contestWinner=sc.nextLine();
        String contestWinnerCategory=sc.nextLine();
        sc.close();

        int out1= findTotalPointsBasedOnWinner(c,contestWinner);
        if(out1!=0){
            System.out.println(out1);
        }
        else {
            System.out.println("there is no matching contest");
        }
        Contest out2= getContestWithSecondHighestPoints(c,contestWinnerCategory);
        if(out2!=null){
            System.out.println(out2.getPoints());
        }
        else{
            System.out.println("There id no matching");
        }

    }
    public static int findTotalPointsBasedOnWinner(Contest c[], String contestWinner){
        int tp=0;
        if(c!=null && contestWinner.length()>0){
            for (int i=0;i<c.length;i++){
                if(c[i].getContestWinner().equalsIgnoreCase((contestWinner))){
                    tp+=c[i].getPoints();
                }
            }
        }
        return tp;
    }   
    public static Contest getContestWithSecondHighestPoints(Contest c[],String contestWinnerCategory){
        Contest m=null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(c!=null && contestWinnerCategory.length()>2){
            for(int i=0;i<c.length;i++){
                pq.add(c[i].getPoints());
            }
           if(pq!=null){
               while(pq.size()>2){
                   pq.poll();
               }
               int p=pq.peek();
               for (int i=0;i<c.length;i++){
                   if(c[i].getPoints()==p){
                       m=c[i];
                   }
               }
           }
        }
       if(m==null){
           return null;
       }
       else {
           return m;
       }
    }

}
