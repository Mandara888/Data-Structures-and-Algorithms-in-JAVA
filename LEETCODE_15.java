import java.util.*;
public class LEETCODE_15 {
        public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

         List<List<Integer>> res=new ArrayList<>();
         List<Integer> list=new ArrayList<>();
         
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){continue;}
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                
            }
            
        }
        return res;  
    }
}
//In Java, Arrays.asList(T... a) is a static utility method in the java.util.Arrays class
//  that converts an array or a comma-separated sequence of elements into a fixed-size List
