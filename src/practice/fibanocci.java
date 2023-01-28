package practice;

public class fibanocci {
    public static void main(String ags[]){
        int nt=0,pt=1;
        int next;
        System.out.println(0);
        System.out.println(1);
        int i=2;
        while(i<10){
            next= nt+pt;
            System.out.println(next);
            nt=pt;
            pt=next;
            i++;
        }
    }

}
