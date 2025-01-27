package DSA.Recursion.RecursionArray;
import java.util.ArrayList;
public class Que3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 5, 6, 7};
        System.out.println(findAllindex(arr, 4, 0)); // Corrected the target and method call
    }

    static ArrayList<Integer> findAllindex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        findAllindexHelper(arr, target, index, list);
        return list;
    }

    static void findAllindexHelper(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return; // Base case: end of array
        }
        if (arr[index] == target) {
            list.add(index); // Add index if element matches target
        }
        findAllindexHelper(arr, target, index + 1, list); // Recursive call
    }
}
