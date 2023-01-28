package TCS;

import java.util.Scanner;
class Footwear{
    int footid;
    String name;
    String type;
    int price;
    Footwear(int footid,String name,String type,int price){
        this.footid=footid;
        this.name=name;
        this.type=type;
        this.price=price;
    }


}

class Solution10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Footwear f[]=new Footwear[5];
        for(int i=0;i<5;i++){
            int footid=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String type=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            f[i]=new Footwear(footid,name,type,price);
        }
        String type=sc.nextLine();
        String name=sc.nextLine();
        int count=getcount(f,type);
        System.out.println(count);
        Footwear out=getsecond(f,name);
        System.out.println(out.name+" "+ out.price);
    }

    //method 1
    public static int getcount( Footwear f[], String type){
        int count =0;
        for(int i=0;i<f.length;i++){
            if(f[i].type.equalsIgnoreCase(type)){
                count ++;
            }
        }
        return count;
    }
    //method 2
    public static Footwear getsecond(Footwear f[],String name) {
        int n = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i].name.equalsIgnoreCase(name)) {
                n++;
            }
        }
            Footwear out[] = new Footwear[n];
            n = 0;
            for (int i = 0; i < f.length; i++) {
                if (f[i].name.equalsIgnoreCase(name)) {
                    out[n++] = f[i];
                }
            }
            int first = out[0].price;
            int second = first;
            for (int i = 0; i < n; i++) {
                if (out[i].price > first) {
                    second = first;
                    first = out[i].price;
                }

            }

            for (int i = 0; i < n; i++) {
                if (out[i].price == second) {
                    return out[i];
                }
            }
            return null;

        }
    }
