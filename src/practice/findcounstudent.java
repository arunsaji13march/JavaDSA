package practice;

import java.util.Arrays;

import java.util.Scanner;



public class findcounstudent{
    public static void main(String[] args) {

        Student1[] students=new Student1[4];

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i <4 ; i++) {

            int a=sc.nextInt();sc.nextLine();

            String b=sc.nextLine();

            String c=sc.nextLine();

            double d=sc.nextDouble();sc.nextLine();

            boolean e=sc.nextBoolean();

            students[i] = new Student1(a,b,c,d,e);



        }

        int ans1= findCountOfDayscholarStudents(students);

        if(ans1>0)

        {

            System.out.println(ans1);

        }

        else

        {

            System.out.println("There are no such dayscholar students");

        }



        Student1 ans2 = findStudentwithSecondHighestScore(students);

        if(ans2==null)

        {

            System.out.println("There are no student from non day scholar");

        }

        else

        {

            System.out.println(ans2.getRollNo()+"#"+ans2.getName()+"#"+ans2.getScore());

        }







    }

    public static int  findCountOfDayscholarStudents(Student1[] students)

    {

        int count=0;

        for (int i = 0; i <students.length ; i++) {

            if(students[i].getScore()>80 && students[i].isDayScholar()==true)

            {

                count=count+1;

            }

        }



        if(count>0)

        {

            return count;

        }

        return 0;

    }



    public  static Student1 findStudentwithSecondHighestScore(Student1[] students)

    {

        double[] arr=new double[0];

        for (int i = 0; i <students.length ; i++) {

            if(students[i].isDayScholar()==false)

            {

                arr= Arrays.copyOf(arr,arr.length+1);

                arr[arr.length-1]=students[i].getScore();

            }

        }

        Arrays.sort(arr);

        double shs= arr[arr.length-2];



        for (int i = 0; i <students.length ; i++) {

            if(students[i].getScore()==shs)

            {

                return students[i];

            }

        }

        return null;

    }

}



class Student1 {

    private  int rollNo;

    private String name ;

    private String branch;

    private double score;

    private boolean dayScholar;





    public Student1(int rollNo, String name, String branch, double score, boolean dayScholar) {

        this.rollNo = rollNo;

        this.name = name;

        this.branch = branch;

        this.score = score;

        this.dayScholar = dayScholar;

    }



    //getters and setters



    public int getRollNo() {

        return rollNo;

    }



    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public String getBranch() {

        return branch;

    }



    public void setBranch(String branch) {

        this.branch = branch;

    }



    public double getScore() {

        return score;

    }



    public void setScore(double score) {

        this.score = score;

    }



    public boolean isDayScholar() {

        return dayScholar;

    }



    public void setDayScholar(boolean dayScholar) {

        this.dayScholar = dayScholar;

    }

}
