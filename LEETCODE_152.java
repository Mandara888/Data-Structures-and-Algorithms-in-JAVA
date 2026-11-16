public class LEETCODE_152 {
      public int maxProduct(int[] nums) {
        int left=1;
        int right=1;
        int maxLeft=Integer.MIN_VALUE;
        int maxRight=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            left=left*nums[i];
            maxLeft=Math.max(maxLeft,left);
            if(left==0){
                left=1;
            }
        }
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            right=right*nums[i];
            maxRight=Math.max(right,maxRight);
            if(right==0){
                right=1;
            }
        }
        int max=Math.max(maxLeft,maxRight);
        return max;
    }
}
