package TCS;
import java.util.*;
class College{
    int id;
    String name;
    int contactno;
    String add;
    int pin;

    College(int id,String name,int contactno,String add,int pin){
        this.id=id;
        this.name=name;
        this.contactno=contactno;
        this.add=add;
        this.pin=pin;
    }

}

class Sample1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        College1 c[]=new College1[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int contactno=sc.nextInt();
            sc.nextLine();
            String add=sc.nextLine();
            int pin =sc.nextInt();
            sc.nextLine();
            c[i]=new College1(id,name,contactno,add,pin);
        }
        String add=sc.nextLine();
        College1 out1=maxpincode(c);
        if(out1==null){System.out.println("No college found with mentioned attribute");}
        else{
            System.out.println("id-"+out1.id);
            System.out.println("name-"+out1.name);
            System.out.println("address-"+out1.add);
            System.out.println("pincode-"+out1.pincode);
        }

        College1 out2=searchadd(c,add);
        if(out2==null){System.out.println("No college found with mentioned attribute");}
        else{
            System.out.println("id-"+out2.id);
            System.out.println("name-"+out2.name);
            System.out.println("address-"+out2.add);
            System.out.println("pincode-"+out2.pincode);
        }
    }


    //find college with max pincode method
    public static College1 maxpincode(College1 c[]){
//        College out1=null;
        int n=c.length;
        int max=c[0].pincode;
        for(int i=0;i<n;i++){
            if(c[i].pincode>max){
                max=c[i].pincode;

            }
        }
        for (int i=0;i<n;i++){
            if(c[i].pincode==max){
                return c[i];

            }
        }
        return null;

    }

    //search college by add
    public static College1 searchadd(College1 c[], String add){
        College1 out2=null;
        int n=c.length;
        for(int i=0;i<n;i++){
            if(c[i].add.equalsIgnoreCase(add)){
                out2=c[i];
                return out2;
            }
        }
        return null;
    }
}
