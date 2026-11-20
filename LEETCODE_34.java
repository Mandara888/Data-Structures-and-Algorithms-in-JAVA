public class LEETCODE_34 {
      public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int idx1=-1;
        int idx2=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target &&(mid==0 || nums[mid-1]!=nums[mid])){
                idx1=mid;
                break;
            }
            else if(nums[mid]==target && nums[mid-1]==nums[mid]){
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        l=0;
         r=nums.length-1;

          while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target &&(mid==nums.length-1 || nums[mid+1]!=nums[mid])){
                idx2=mid;
                break;
            }
            else if(nums[mid]==target && nums[mid]==nums[mid+1]){
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return new int[]{idx1,idx2};

    }
}
