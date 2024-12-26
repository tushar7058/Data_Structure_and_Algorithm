package DSA.StackQueue;
import java.util.*;;
public class SumOFSubArrayRanges {
    public long subArrayRanges(int[] nums) {
        int n = nums.length , j , k;
        long res = 0;

        Stack<Integer>s = new Stack<>();

        for(int i=0;i<=n;i++){
            while(!s.isEmpty() && nums[s.peek()]>(i==n? Integer.MIN_VALUE : nums[i])){
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res -= (long)nums[j]*(i-j)*(j-k);            
                
            }
            s.push(i);
        }
        s.clear();
        for(int i=0;i<=n;i++){
            while(!s.isEmpty()&& nums[s.peek()]<(i==n ? Integer.MAX_VALUE : nums[i])){
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res +=(long)nums[j]*(i-j)*(j-k);
            }
            s.push(i);
        }
        return res;
    }
}

/*
 * Intuition
res = sum(A[i] * f(i))
where f(i) is the number of subarrays,
in which A[i] is the minimum.

To get f(i), we need to find out:
left[i], the length of strict bigger numbers on the left of A[i],
right[i], the length of bigger numbers on the right of A[i].

Then,
left[i] + 1 equals to
the number of subarray ending with A[i],
and A[i] is single minimum.

right[i] + 1 equals to
the number of subarray starting with A[i],
and A[i] is the first minimum.

Finally f(i) = (left[i] + 1) * (right[i] + 1)

For [3,1,2,4] as example:
left + 1 = [1,2,1,1]
right + 1 = [1,3,2,1]
f = [1,6,2,1]
res = 3 * 1 + 1 * 6 + 2 * 2 + 4 * 1 = 17

Explanation
To calculate left[i] and right[i],
we use two increasing stacks.

It will be easy if you can refer to this problem and my post:
901. Online Stock Span
I copy some of my codes from this solution.

Complexity
All elements will be pushed twice and popped at most twice
Time O(n)
Space O(n)
  
 */