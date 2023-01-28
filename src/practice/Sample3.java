package practice;

import java.util.Scanner;

class Antenna{
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;
    Antenna(int antennaid,String antennaName,String projectLead, double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }
    int getAntennaid(){ return this.antennaid;}
    String getName(){ return this.antennaName;}
    String getProjectLead(){ return this.projectLead;}
    double getAntennaVSWR(){ return this.antennaVSWR;}

}

public class Sample3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Antenna a[]=new Antenna[n];
        for(int i=0;i<n;i++){
            int antennaid= sc.nextInt();
            sc.nextLine();
            String antennaName=sc.nextLine();
            String projectLead=sc.nextLine();
            double antennaVSWR= sc.nextDouble();
            a[i]=new Antenna(antennaid,antennaName,projectLead,antennaVSWR);
        }
        String antennaName=sc.nextLine();
        double antennaVSWR=sc.nextDouble();


    }
    public static int searchAntennaByName(Antenna a[],String antennaName){
        int id=-1;
        for(int i=0;i<a.length;i++){
            if(a[i].getName().equalsIgnoreCase(antennaName)){
                id=a[i].getAntennaid();
            }
        }
        if(id==-1){
            return 0;
        }
        else{
            return id;
        }
    }
    public static Antenna sortAntennaByVSWR(Antenna a[], double antennaVSWR){
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                Antenna tmp;
                if (a[i].getAntennaVSWR() > a[j].getAntennaVSWR())
                {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }

        }

        return null;
    }}
