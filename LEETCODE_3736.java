public class LEETCODE_3736 {
     public int minMoves(int[] nums) {
        int sum=0;

        for(int i=0;i<nums.length;i++){
         sum=Math.max(sum,nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=sum-nums[i];
        }
     return ans;
    }
}
