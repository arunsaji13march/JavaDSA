package DataStructure;

public class SET {
    int capacity;
    int top;
    int arr[];
    SET(int size){
        capacity=size;
        arr=new int[size];
        top=-1;
    }
    public void insert(int val){
        if(isFull()){
            System.out.println("is full");
        }
        else{
            if(isContains(val)){
                System.out.println("is already in set");
            }
            else
                arr[++top]=val;
        }


    }
    public boolean isFull(){
        if(arr.length==capacity){
            return true;
        }
        return false;
    }
    public boolean isContains(int val ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return true;
            }
        }
        return false;
    }
}
