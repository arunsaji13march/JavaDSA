package TCS;
import java.util.*;
class PM {
    int id;
    String name;
    String type;
    double price;
    int noofprofiles;

    PM(int id,String name,String type,double price,int noofprofiles){
        this.id=id;
        this.name=name;
        this.type=type;
        this.price=price;
        this.noofprofiles=noofprofiles;
    }
}

class Sample2{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PM pm[]=new PM[4];
        for(int i=0;i<4;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String type=sc.nextLine();
            double price=sc.nextDouble();sc.nextLine();
            int noofprofiles=sc.nextInt();sc.nextLine();
            pm[i]=new PM(id,name,type,price,noofprofiles);
        }
        String type=sc.nextLine();
        double avg=AvgPrice(pm,type);
        System.out.println(avg);
    }


    //method
    public static int AvgPrice(PM pm[],String type){
        int count =0;
        double Avg=0.0;
        for(int i=0;i<pm.length;i++){
            if(pm[i].type.equalsIgnoreCase(type) && pm[i].noofprofiles>3){
                Avg=Avg+pm[i].price;
                count++;
            }
        }
        int avg=(int)(Avg/count);
        return avg;
    }
}