package PatikaExamples;

public class BinarySearchLeetCode {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;


        while (right - left > 1) {

            int mid = (right + left) /2 ;
            int v = nums[mid];

            if ( v > target) {
                right = mid ;
            } else {
                left = mid;
            }

        }

        return nums[left] == target ? left : -1;
    }
}
