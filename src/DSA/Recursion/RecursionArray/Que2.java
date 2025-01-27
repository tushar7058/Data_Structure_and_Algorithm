package DSA.Recursion.RecursionArray;
// linear search with Recursion
public class Que2 {
    public static void main(String[] args) {
       
        int arr[] = {1,2,3,4,4,5,5,6,7};
        System.out.println("ans is based on Function : "+ find(arr, 4, 0));
        System.out.println("ans is based on index :"+findindex(arr, 4, 0));
        System.out.println("ans is search from last index : "+findindeFromLast(arr, 4, 0));
    }
    // give result on the basis of  True or false.
    static boolean find(int [] arr ,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    // return the index after searching element if found or not found
    static int findindex(int [] arr ,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target ){
            return target;
        }
        else{
            return findindex(arr, target, index+1);
        }
    }
    // search from the last
    static int findindeFromLast(int [] arr ,int target,int index){
        if(index==-1 ){
            return -1;
        }
        if(arr[index]==target ){
            return target;
        }
        else{
            return findindeFromLast(arr, target, index-1);
        }
    }
}

