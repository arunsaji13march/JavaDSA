package TCS;
import java.util.Scanner;
class Newspaper1 {
    int regno;
    String name;
    int year;
    int price;
    Newspaper1(int regno, String name, int year, int price){
        this.regno=regno;
        this.name=name;
        this.year=year;
        this.price= price;
    }
}

class Solution11{
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

        int total=totalPrice(n,year);
        System.out.println(total);

        Newspaper1 out[]=search(n,name);
        if(out==null){
            System.out.println("empth");
        }
        else{
            for(int i=0;i<out.length;i++){
                System.out.println(out[i].name+" "+out[i].regno);
            }
        }
    }

    public static int totalPrice(Newspaper1 n[], int year){
        int total=0;
        for(int i=0;i<n.length;i++){
            if(n[i].year==year){
                total=total+n[i].price;
            }
        }
        return total;
    }

    //method 2
    public static Newspaper1[] search(Newspaper1 n[], String name){
        int x=0;
        for(int i=0;i<n.length;i++){
            if(n[i].name.equalsIgnoreCase(name)){
                x++;
            }
        }
        Newspaper1 out[]=new Newspaper1[x];
        x=0;
        for(int i=0;i<n.length;i++){
            if(n[i].name.equalsIgnoreCase(name)){
                out[x++]=n[i];
            }
        }
        return out;
    }
}