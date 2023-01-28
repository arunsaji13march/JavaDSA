package Digital;

public class sample2 {
    public static void main(String[] args) {
        int arr[]={35,1,24,44,30};
        int k=60;
        boolean flag=false;
        //System.out.println(calculate(arr,k));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==45){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("j loop");

                break;
            }
        }



    }
    public static int calculate(int arr[],int k){
        int max=arr[0]+arr[1];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int currsum=arr[i]+arr[j];
                if(currsum>max && currsum<=k){
                    max=currsum;
                }
            }
        }
        return max;
    }
}
