import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove elements outside the window
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.pop();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }

            dq.offer(i);

            // Store result
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }
        return result;
    }
}
