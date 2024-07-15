public class majorityElement {
    public int majorityElements(int[] nums) {
        int chil = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                chil = nums[i];
            }


            if(nums[i] == chil){
                count++;
            }else{
                count--;
            }
        }
        return chil;
    }
}
