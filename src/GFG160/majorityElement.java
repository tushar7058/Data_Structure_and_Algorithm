package GFG160;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        
    }

    public List<Integer>FindMajority(int[]nums){
         int n = nums.length;

         List<Integer> result = new ArrayList<>();

         Map<Integer,Integer>FreMap = new HashMap<>();
         
         // count frequency
        // Count occurrences of each element
        for (int num : nums) {
            FreMap.put(num, FreMap.getOrDefault(num, 0) + 1);
        }

        // find elements occuring more than n/3 times

        for(Map.Entry<Integer,Integer>entry:FreMap.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
