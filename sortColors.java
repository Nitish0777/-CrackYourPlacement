public class sortColors {
    public void sortColor(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int counter = 0;
        while (counter <= end) {
            if (nums[counter] == 0) {
                int temp = nums[start];
                nums[start] = nums[counter];
                nums[counter] = temp;
                start++;
                counter++;
            } else if (nums[counter] == 2) {
                int temp = nums[end];
                nums[end] = nums[counter];
                nums[counter] = temp;
                end--;
            } else {
                counter++;
            }
        }
    }
}
