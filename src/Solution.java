import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int index;
        int[] expectedNums = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    index = nums[j];
                    expectedNums = new int[nums.length - 1];
                    for (int k = 0; k < nums.length; k++) {
                        if (k != index) {
                            int newIndex = k < index ? k : k - 1;
                            expectedNums[newIndex] = nums[k];
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(expectedNums));
        return expectedNums.length;
    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(n));
    }
}
