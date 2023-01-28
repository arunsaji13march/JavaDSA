package practice;

import java.util.Scanner;

class Engine{
    int engineId;
    String engineName;
    String engineType;
    double enginePrice;
    Engine(int engineId,String engineName,String engineType,double enginePrice){
        this.engineId=engineId;
        this.engineName=engineName;
        this.engineType=engineType;
        this.enginePrice=enginePrice;
    }

    public int getEngineId() {
        return engineId;
    }
    public String getEngineName() {
        return engineName;
    }
    public double getEnginePrice() {
        return enginePrice;
    }
    public String getEngineType(){
        return engineType;
    }
}

public class Sample4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= 4;
        Engine e[] = new Engine[n];
        for(int i=0;i<n;i++){
            int engineId=sc.nextInt();
            sc.nextLine();
            String engineName=sc.nextLine();
            String engineType=sc.nextLine();
            double enginePrice= sc.nextDouble();

            e[i]=new Engine(engineId,engineName,engineType,enginePrice);
        }
        String engineType=sc.nextLine();
        String engineName=sc.nextLine();

        findAvgEnginePriceByType(e,engineType);
        Engine out[]=searchEngineByName(e,engineName);
        for(int i=0;i<out.length;i++){
            System.out.println(out[i].getEngineId());
        }
    }
    public static void findAvgEnginePriceByType(Engine e[],String engineType){
        double averagePrice=0,count=0;
        for(int i=0;i<e.length;i++){
            if(e[i].engineType.equalsIgnoreCase(engineType)){
                averagePrice=averagePrice+e[i].enginePrice;
                count++;
            }
        }
        if(averagePrice>0){
            System.out.println(averagePrice/count);
        }
        else{
            System.out.println("no engine with given type");
        }
    }
    public static Engine[] searchEngineByName (Engine e[],String engineName){
        Engine out[]=new Engine[e.length];
        int count=0;
        for(int i=0;i<e.length;i++){
            if(e[i].getEngineName().equalsIgnoreCase(engineName)){
                out[count] =e[i];
                count++;
            }
        }
        return out;
    }

}
