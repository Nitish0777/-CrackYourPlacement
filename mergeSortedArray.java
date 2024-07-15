public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int l  = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[l++] = nums1[i++];
            }else{
                ans[l++] = nums2[j++];
            }
        }
        while(i < m){
            ans[l++] = nums1[i++];
        }
        while(j < n){
            ans[l++] = nums2[j++];
        }

        for(int o = 0; o < ans.length; o++){
            nums1[o] = ans[o];
        }
    }
}
