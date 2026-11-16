public class LEETCODE_53{
    //Kadane's Algorithm:=>
       public int maxSubArray(int[] nums) {
        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i:nums){
            sum+=i;
            maxSum=Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}