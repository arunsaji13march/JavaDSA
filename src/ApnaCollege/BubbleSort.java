package ApnaCollege;

public class BubbleSort {
    public static void main(String args[]){
        int arr[]={33,5,66,23,11,2,4,67};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
