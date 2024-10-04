package LinearSearch;

public class minimumNum {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,4};
        System.out.println(minnum(arr));
    }
    static  int minnum(int arr[]){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
