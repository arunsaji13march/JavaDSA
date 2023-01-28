package practice;

import java.util.*;
public class MyClass2
{

    public static void main(String[] args)
    {
//code to read values
        Scanner sc=new Scanner(System.in);
        Inventory[] inventory=new Inventory[4];
        for(int i=0;i<4;i++){
            String inventoryid=sc.nextLine();
            int maxquality=sc.nextInt();
            sc.nextLine();
            int currquality=sc.nextInt();
            sc.nextLine();
            int threshold=sc.nextInt();
            inventory[i]=new Inventory(inventoryid,maxquality,currquality,threshold);

        }
        int limit=sc.nextInt();
//code to call required method
        Inventory out[]=replenish(limit,inventory);
//code to display the results
        for(int i=0;i<out.length;i++){
            if(out[i].getThreshold()>=75){
                System.out.println(out[i].getInventoryId()+" Critical Filling");
            }
            else if(out[i].getThreshold()<75 && out[i].getThreshold()>50){
                System.out.println(out[i].getInventoryId()+" Moderate Filling");
            }
            else{
                System.out.println(out[i].getInventoryId()+" Non-Critical Filling");
            }
        }
    }

    public static Inventory[] replenish(int limit, Inventory[] inventory)
    {
//method logic
        Inventory out[];
        int j=0;
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                j++;
            }
        }
        out= new Inventory[j];
        j=0;
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                out[j]=inventory[i];
                j++;
            }
        }
        return out;

    }
}

class Inventory
{
    //code to build practice.Inventory class
    String inventoryid;
    int maxquality;
    int currquality;
    int threshold;
    Inventory( String inventoryid,int maxquality,int currquality,int threshold){
        this.inventoryid=inventoryid;
        this.maxquality=maxquality;
        this.currquality=currquality;
        this.threshold=threshold;
    }
    public int getThreshold(){return this.threshold;}
    public String getInventoryId(){return this.inventoryid;}
    public void setInventoryId(String inventoryid){this.inventoryid=inventoryid;}

}
            