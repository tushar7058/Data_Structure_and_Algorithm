package Arraylist.questions;

public class maximum_value {
    public static void main(String[] args) {
        int arr [] = {1,2,3,45,6};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,3));
     }
     // func for range
    static int maxrange(int arr[],int start ,int end){
        int max = arr[start];
        for(int i=start;i<=end;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
     // func for max value
     static int max(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
     }
}
