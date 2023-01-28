package advanxedJava;

import java.util.Scanner;

class Music{
    int no;
    String type;
    int count;
    double duration;

    Music(int no,String type,int count,double duration){
        this.no=no;
        this.type=type;
        this.count=count;
        this.duration=duration;
    }
}
class Cpa1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Music m[]=new Music[4];
        for(int i=0;i<4;i++){
            int no=sc.nextInt();sc.nextLine();
            String type=sc.nextLine();
            int count=sc.nextInt();sc.nextLine();
            double duration=sc.nextDouble();sc.nextLine();
            m[i]=new Music(no,type,count,duration);

        }
        int count=sc.nextInt();sc.nextLine();
        double duration=sc.nextDouble();

        int avg=findAvg(m,count);
        if(avg==0){
            System.out.println("No found");
        }
        else{System.out.println(avg);}

        Music out[]=sortByDuration(m,duration);
        if(out==null){
            System.out.println("empty");
        }
        else{
            for(int i=0;i<out.length;i++){
                System.out.println(out[i].type);
            }
        }
    }
    public static int findAvg(Music m[] ,int count){
        int c=0,k=0;
        for(int i=0;i<m.length;i++){
            if(m[i].count>count){
                c=c+m[i].count;
                k++;
            }
        }
        return c/k;
    }

    public static Music[] sortByDuration(Music m[], double duration){
        int k=0;
        for(int i=0;i<m.length;i++){
            if(m[i].duration>duration){
                k++;
            }
        }
        Music out[]=new Music[k];
        k=0;
        for(int i=0;i<m.length;i++){
            if(m[i].duration>duration){
                out[k++]=m[i];
            }
        }

        for(int i=0;i<out.length;i++){
            for(int j=i+1;j<out.length;j++){
                Music temp=null;
                if(out[i].duration>out[j].duration){
                    temp=out[i];
                    out[i]=out[j];
                    out[j]=temp;
                }
            }
        }
        return out;
    }
}
