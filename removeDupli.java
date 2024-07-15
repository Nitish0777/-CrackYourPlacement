public class removeDupli {
    public int removeDuplicates(int[] nums) {
        int start = 1;
        for(int i = 1; i< nums.length; i++){
            if(nums[start-1] != nums[i]){
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}
