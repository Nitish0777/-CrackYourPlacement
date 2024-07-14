public class moveZero0 {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0;
        int r  = nums.length-1;
        int i =0;
        while(i <= nums.length-1){
            if(nums[i] != 0){
                arr[l++] = nums[i];
            }else{
                arr[r--] = 0;
            }
            i++;
        }
        for(int j = 0; j < arr.length; j++){
            nums[j] = arr[j];
        }
    }
}
