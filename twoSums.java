import java.util.HashMap;

public class twoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sub = target-nums[i];
            if(map.containsKey(sub)){
                return new int[]{map.get(sub),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
