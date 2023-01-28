package TCS;

import java.util.*;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student1 s[]=new Student1[4];

        for(int i=0;i<4;i++){
            int roll=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String branch=sc.nextLine();
            double score=sc.nextDouble();
            sc.nextLine();
            boolean dayscholar=sc.nextBoolean();
            sc.nextLine();
            s[i]=new Student1(roll,name,branch,score,dayscholar);
        }
        int k=count(s);
        Student1 out=second(s);

        if(k==0){System.out.println("There is no such dayscholar students");}
        else{System.out.println(k);}

        if(out!=null){ System.out.println(out.roll+"#"+out.name+"#"+out.score);}
        else{

            System.out.println("There is no such dayscholar students");
        }

    }
    public static int count(Student1 s[]){
        int k=0;
        for(int i=0;i<4;i++){
            if(s[i].getScore()>80 && s[i].getdayScholar()==true){
                k++;
            }
        }
        return k;
    }

    public static Student1 second(Student1 s[]){
        double first,second;
        first=second=0;
        for(int i=0;i<4;i++){
            if(s[i].getdayScholar()==false && s[i].getScore()>first){
                second=first;
                first=s[i].getScore();
            }
            else if(s[i].getScore()>second && s[i].getScore()!=first && s[i].getdayScholar()==false){
                second=s[i].getScore();
            }
        }
        for(int i=0;i<4;i++){
            if(s[i].getdayScholar()==false && s[i].getScore()==second){
                return s[i];
            }
        }
        return null;

    }
}






class Student1{
    int roll;
    String name;
    String branch;
    double score;
    boolean dayscholar;

    Student1(int roll,String name,String branch,double score,boolean dayscholar){
        this.roll=roll;
        this.name=name;
        this.branch=branch;
        this.score=score;
        this.dayscholar=dayscholar;
    }
    public boolean getdayScholar(){return dayscholar;}
    public double getScore(){ return score;}
}

