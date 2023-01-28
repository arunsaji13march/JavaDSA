package TCS;
import java.util.*;
class demo7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Bank b[]=new Bank[4];
        for(int i=0;i<4;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();;
            int noofcust=sc.nextInt();sc.nextLine();
            String city=sc.nextLine();
            b[i]=new Bank(id,name,noofcust,city);
        }
        String city=sc.nextLine();
        sc.close();
        int avg=findAvg(b,city);
        if(avg==0){System.out.println("Bank not Found");}
        else{System.out.println(avg);}

        Bank out=getSecond(b);
        if(out==null){System.out.println("Bank not Found");}
        else{
            System.out.println(out.id);
            System.out.println(out.name);
            System.out.println(out.noofcust);
            System.out.println(out.city);

        }
    }
    //method1
    public static int findAvg(Bank b[],String city){
        int count=1,sum=0;
        for(int i=0;i<b.length;i++){
            if(b[i].city.equalsIgnoreCase(city)){
                sum=sum+b[i].noofcust;
                count++;
            }
        }
        return sum/count;
    }
    //method 2
    public static Bank getSecond(Bank b[]){
        int temp[]=new int[4];
        for(int i=0;i<b.length;i++){
            temp[i]=b[i].noofcust;
        }
        Arrays.sort(temp);
        int x=temp[1];
        if(x%2==0){
            for(int i=0;i<4;i++){
                if(b[i].noofcust==x){return b[i];}
            }
        }
        return null;
    }

}



class Bank{
    int id;
    String name;
    int noofcust;
    String city;

    Bank(int id,String name,int noofcust,String city){
        this.id=id;
        this.name=name;
        this.noofcust=noofcust;
        this.city=city;
    }
}
