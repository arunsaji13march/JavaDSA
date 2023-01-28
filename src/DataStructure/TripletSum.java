package DataStructure;

public class TripletSum {
    public static void conquer(int arr[],int si,int mid, int ei){
        int merger[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid &&  idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merger[x++]=arr[idx1++];
            }
            else{
                merger[x++]=arr[idx2++];
            }
        }
        while(idx2<=mid){
            merger[x++]=arr[idx1++];
        }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int mid=(si+ei)/2;//si+(ei+si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
}
