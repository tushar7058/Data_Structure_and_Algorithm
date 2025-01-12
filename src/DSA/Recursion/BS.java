package DSA.Recursion;

public class BS {

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,7};
        System.out.println("index no is :"+search(arr, 0, arr.length-1, 2));
    }
    static int search(int [] arr , int start , int end,int target){
        if(start>end){
            return -1;
        }
        int m= start+(end-start)/2;

        if(arr[m]==target){
            return m;
        }

        if(target<arr[m]){
           return search(arr, start, m-1, target);
        }
        else{
            return search(arr, start+1, end, target);
        }

    }
}