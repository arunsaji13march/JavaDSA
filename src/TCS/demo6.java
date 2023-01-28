package TCS;



import java.util.Scanner;
class demo6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        College1 c[]=new College1[n];

        for(int i=0;i<n;i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int contact=sc.nextInt();sc.nextLine();
            String add=sc.nextLine();
            int pincode=sc.nextInt();sc.nextLine();
            c[i]=new College1(id,name,contact,add,pincode);
        }
        String add=sc.nextLine();
        sc.close();

        College1 out1=findCollege(c);
        if(out1==null){
            System.out.println("No college found with 		mentioned attribute");
        }
        else{
            System.out.println("id-"+out1.id);
            System.out.println("name-"+out1.name);
            System.out.println("contact-"+out1.contact);
            System.out.println("address-"+out1.add);
            System.out.println("pincode-"+out1.pincode);

        }

        College1 out2=searchCollege(c,add);
        if(out2==null){
            System.out.println("No college found with 		mentioned attribute");
        }
        else{
            System.out.println("id-"+out2.id);
            System.out.println("name-"+out2.name);
            System.out.println("contact-"+out2.contact);
            System.out.println("address-"+out2.add);
            System.out.println("pincode-"+out2.pincode);

        }

    }

    //method1
    public static College1 findCollege(College1 c[]){
        College1 out=null;
        int max=0;
        for(int i=0;i<c.length;i++){
            if(c[i].pincode>max){
                max=c[i].pincode;
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i].pincode==max){
                out=c[i];
            }
        }
        return out;
    }

    //method2
    public static College1 searchCollege(College1 c[], String add){
        College1 out=null;
        for(int i=0;i<c.length;i++){
            if(c[i].add.equalsIgnoreCase(add)){
                out=c[i];
            }
        }
        return out;
    }
}





class College1 {
    int id;
    String name;
    int contact;
    String add;
    int pincode;

    College1(int id, String name, int contact, String add, int pincode){
        this.id=id;
        this.name=name;
        this.contact=contact;
        this.add=add;
        this.pincode=pincode;
    }

}