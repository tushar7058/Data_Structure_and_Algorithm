package DSA;
import java.util.*;
public class majority {
    public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;
        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }
        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}

/*
// optimal solution

int count =0;
int ele;

for(int i =0;i<v.length;i++)
{
if(count ==0){
count =1;
ele =v[i];
}
else if(v[i]==ele){
count++;
}
else(){
count--;
}
int count1 = 0;
for(int i=0;iv.length;i++){
if(v[i]==ele)
count++;
}
if(count1>(v.length/2)){
return ele;
}
return -1;

 */