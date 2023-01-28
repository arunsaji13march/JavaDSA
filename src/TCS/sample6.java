package TCS;

import java.util.Scanner;

class Student{
    int studentid;
    String studentname;
    int score;
    String collegename;
    Student(int studentid,String studentname,int score,String collegename){
        this.studentid=studentid;
        this.studentname=studentname;
        this.score=score;
        this.collegename=collegename;
    }
}

class solution6{
    public static void main(String args[]){
        Student s[]=new Student[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            int studentid=sc.nextInt();sc.nextLine();
            String studentname=sc.nextLine();
            int score=sc.nextInt();sc.nextLine();
            String collegename=sc.nextLine();
            s[i]=new Student(studentid,studentname,score,collegename);
        }
        String collegename=sc.nextLine();
        Student out= secondHighest(s);
        System.out.println(out.studentname);
        Student out2=lowScore(s,collegename);
        System.out.println(out2.score);
    }

    public static  Student secondHighest(Student s[]){
        int max=s[0].score;
        int second=0;
        for(int i=0;i<s.length;i++){
            if(s[i].score>max){
                second= max;
                max=s[i].score;
            }
        }
        if(second==0){second=max;}
        for(int i=0;i<s.length;i++){
            if(s[i].score==second){
                return s[i];
            }
        }
        return null;
    }
    public static Student lowScore(Student s[],String collegename){
        int n=0;

        for(int i=0;i<s.length;i++){
            if(s[i].collegename.equalsIgnoreCase(collegename)){
                n++;
            }
        }

        Student out[]=new Student[n];
        n=0;
        for(int i=0;i<s.length;i++){
            if(s[i].collegename.equalsIgnoreCase(collegename)){
                out[n++]=s[i];
            }
        }
        int min=out[0].score;
        for(int i=0;i<n;i++){
            if(out[i].score<min){
                min=out[i].score;
            }
        }
        for(int i=0;i<n;i++){
            if(out[i].score==min){
                return out[i];
            }
        }
        return null;
    }
}
