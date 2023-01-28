package TCS;

import java.util.Scanner;
class Newspaper{
    int regno;
    String name;
    int year;
    int price;

    Newspaper(int regno,String name,int year,int price){
        this.regno=regno;
        this.name=name;
        this.year=year;
        this.price=price;
    }
}

class Solutin3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Newspaper1 n[]=new Newspaper1[4];
        for(int i=0;i<4;i++){
            int regno=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int year=sc.nextInt();sc.nextLine();
            int price=sc.nextInt();sc.nextLine();

            n[i]=new Newspaper1(regno,name,year,price);
        }

        int year=sc.nextInt();sc.nextLine();
        String name=sc.nextLine();
        int sum=totalprice(n,year);
        if(sum==0){System.out.println("no newspaper present");}

        else {System.out.println(sum);}

        Newspaper1 out=search(n,name);
        if(out==null){System.out.println("no newspaper present");}
        else{
            System.out.println("regno- "+out.regno);
            System.out.println("name- "+out.name);
            System.out.println("publicationyear- "+out.year);
            System.out.println("price- "+out.price);
        }
    }


    public static int totalprice(Newspaper1 n[], int year){
        int sum=0;
        for(int i=0;i<n.length;i++){
            if(n[i].year==year){
                sum=sum+n[i].price;
            }
        }
        return sum;
    }


    public static Newspaper1 search(Newspaper1 n[], String name){
        for(int i=0;i<n.length;i++){
            if(n[i].name.equalsIgnoreCase(name)){
                return n[i];
            }
        }
        return null;
    }


}



