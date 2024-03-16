import java.util.*;
public class ArrayRotationUsingQueue {
    public static void rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            queue.add(num);
        }
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int lastElement = queue.poll();
            queue.add(lastElement);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();
        }
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;
        System.out.println("Original Array: " + Arrays.toString(nums));
        rotateArray(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}