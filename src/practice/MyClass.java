package practice;

import java.util.Scanner;

public class MyClass
{

    public static void main(String[] args)
    {
//code to read values
        Player1 p[]=new Player1[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String country=sc.nextLine();
            String side=sc.nextLine();
            double price=sc.nextDouble();

            p[i]=new Player1(id,country,side,price);

        }
        String search=sc.nextLine();
        sc.close();

//code to call required method
        Player1 out[]=searchPlayerForMatch(search,p);
//code to display the result
//        for(int i=0;i<out.length;i++)
//        {
//            System.out.println(out[i].getid());
//        }
        System.out.println(p[1].getside());

    }

    public static Player1[] searchPlayerForMatch(String search, Player1[] p)
    {
//method logic
        Player1 out[]=new Player1[4];

        int j=0;
        for(int i=0;i<p.length;i++){
            if(p[i].getside().equalsIgnoreCase(search)){
                out[j]=p[i];
                j++;
            }
        }
  System.out.println(out[1].getcountry());
        return out;

    }
}

class Player1
{
    //code to build Player class
    int id;
    String country;
    String side;
    double price;
    Player1(int id, String country, String side, double price){
        this.id=id;
        this.country=country;
        this.side= side;
        this.price=price;
    }
    public int getid(){return this.id;}
    public String getcountry(){return this.country;}
    public String getside(){return this.side;}
    public double getprice(){return this.price;}

}

