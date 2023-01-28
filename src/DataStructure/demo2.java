package DataStructure;
import java.util.*;
class demo2{
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Bill b[]=new Bill[n];
        for(int i=0;i<n;i++){
            int no=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String type=sc.nextLine();
            double amount=sc.nextDouble();
            sc.nextLine();
            boolean status=sc.nextBoolean();
            sc.nextLine();
            b[i]=new Bill(no,name,type,amount,status);
        }
        boolean status=sc.nextBoolean();sc.nextLine();
        String type=sc.nextLine();
        sc.close();

        Bill out[]=findMaxBill(b,status);
        if(out==null){System.out.println("There are no bill with the given status");}
        else{
            System.out.println(out[0].no+"#"+out[0].getName());

        }

        int count =getCount(b,type);
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("There are no bills with given type of connection");
        }

    }
    //method1
    public static Bill[] findMaxBill(Bill b[],boolean status){
        Bill temp;
        int count=0;
        for(int i=0;i<b.length;i++){
            if(b[i].getStatus()==status){
                //out[count++]=b[i];
                count++;
            }
        }
        Bill out[]=new Bill[count];
        count=0;
        for(int i=0;i<b.length;i++){
            if(b[i].getStatus()==status){
                out[count++]=b[i];

            }
        }


        for(int i=0;i<out.length;i++){
            for(int j=i+1;j<out.length;j++){
                if(out[i].getAmount() > b[j].getAmount()) {
                    temp = out[i];
                    out[i] = out[j];
                    out[j] = temp;
                }

            }

        }

        return out;

    }

    //method2
    public static int getCount(Bill b[],String type){
        int count =0;
        for(int i=0;i<b.length;i++){
            if(b[i].getType().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }
}





class Bill{
    int no;
    String name;
    String type;
    double amount;
    boolean status;

    Bill(int no,String name,String type,double amount,boolean status){
        this.no=no;
        this.name=name;
        this.type=type;
        this.amount=amount;
        this.status=status;
    }
    public String getType(){return type;}
    public boolean getStatus(){return status;}
    public double getAmount(){return amount;}
    public String getName(){return name;}

}
