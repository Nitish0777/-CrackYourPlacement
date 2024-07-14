public class jumpgames {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        int n = nums.length-1;
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxJump){
                return false;
            }
            maxJump = Math.max(maxJump,i+nums[i]);
            if(maxJump >= n){
                return true;
            }
        }
        return false;
    }
}
