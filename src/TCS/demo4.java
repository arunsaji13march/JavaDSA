package TCS;
import java.util.Scanner;
public class demo4 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Music m[]=new Music[4];
        for(int i=0;i<4;i++){
            int  listno=sc.nextInt();
            sc.nextLine();
            String type=sc.nextLine();;
            int count=sc.nextInt();sc.nextLine();
            double duration=sc.nextDouble();
            sc.nextLine();
            m[i]=new Music(listno,type,count,duration);
        }
        int count =sc.nextInt();sc.nextLine();
        double duration=sc.nextDouble();sc.nextLine();
        sc.close();

        int k=findCount(m,count);
        if(count==0){
            System.out.println("No playlist found");
        }
        else{
            System.out.println(k);
        }
        Music out[]=sortType(m, duration);
        if(out==null){
            System.out.println("No playlist found with mentioned attribute");
        }
        else{
            for(int i=0;i<out.length;i++){
                System.out.println(out[i].type);
            }
        }

    }


    //method 1
    public static int findCount(Music m[],int count){
        int k=0;
        int sum=0;
        for(int i=0;i<m.length;i++){
            if(m[i].count > count){
                k++;
                sum=sum+m[i].count;
            }
        }
        return sum/k;
    }

    //method 2
    public static Music[] sortType(Music m[], double duration){
        int count=0;
        for(int i=0;i<m.length;i++){
            if(m[i].duration> duration){
                count++;
            }
        }
        Music out[]=new Music[count];
        count=0;
        for(int i=0;i<m.length;i++){
            if(m[i].duration> duration){
                out[count++]=m[i];
            }
        }
        Music temp=null;
        for(int i=0;i<out.length;i++){
            for(int j=i+1;j<out.length;j++){
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





class Music{
    int  listno;
    String type;
    int count;
    double duration;

    Music(int listno,String type,int count,double duration){
        this.listno=listno;
        this.type=type;
        this.count=count;
        this.duration=duration;
    }
}
