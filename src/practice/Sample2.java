package practice;

import java.util.Scanner;

class Vehicle{
    int number;
    String name;
    double price;

    Vehicle(int number, String name, double price){
        this.number=number;
        this.name= name;
        this.price=price;
    }
    public int getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }

}

public class Sample2 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        Vehicle v[]= new Vehicle[n];
        for (int i=0;i<n;i++){
            int number=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            double price=sc.nextDouble();
            v[i]=new Vehicle(number,name,price);
        }
        String Vname=sc.nextLine();
        Vehicle v1=findVehicleByMinimumPrice(v);
        Vehicle v2=searchVehicleByName(v,Vname);

        System.out.println("number-"+v1.getNumber());
        System.out.println("name-"+v1.getName());
        System.out.println("price-"+v1.getPrice());

        if(v2==null){
            System.out.println("not found");
        }
        else{
            System.out.println("number-"+v2.getNumber());
            System.out.println("name-"+v2.getName());
            System.out.println("price-"+v2.getPrice());
        }

    }
    public static  Vehicle findVehicleByMinimumPrice(Vehicle v[]){
        double min=v[0].getPrice();
        int count=0;
        for(int i=1;i<v.length;i++){
            if(min>v[i].getPrice()) {
                min = v[i].getPrice();
                count = i;
            }
        }
        return v[count];
    }
    public static Vehicle searchVehicleByName(Vehicle v[],String Vname){
        int count =-1;
        Vehicle m= null;
        for (int i = 0; i<v.length; i++){
            if(v[i].getName().equalsIgnoreCase(Vname)){
                m=v[i];
            }

        }
        if(m==null){ return null;}
        else return m;


    }

}
