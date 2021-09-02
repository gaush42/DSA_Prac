import java.util.*;

class DSA_Array{

    public static void ReverseArray(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void MaxAndMin(int[] arr){
        int len = arr.length-1;
        int min=0,max=0;
        for(int i=0;i<len;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.print("Min "+ arr[min]+" "+ "Max "+ arr[max]);
    }
    public static void KthMinAndMax(int[] arr){
        int len = arr.length;
        int k=2;
        for(int i=0;i<len; i++){
            for(int j=i; j<len; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n"+ "Kth min "+arr[k-1] + "  Kth max "+ arr[len-k]);
    }
    public static void Sort012(){
        int[] arr = {1,2,0,2,1,0,0};
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count_0++;
            }
            if(arr[i]==1){
                count_1++;
            }
            if(arr[i]==2){
                count_2++;
            }
        }
        for(int i=0;i<count_0;i++){
            arr[i]=0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            arr[i]=1;
        }
        for(int i=count_0+count_1;i<arr.length;i++){
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,9,2,4,6,3};
        //ReverseArray(arr);
        //MaxAndMin(arr);
        //KthMinAndMax(arr);
        Sort012();
    }
}