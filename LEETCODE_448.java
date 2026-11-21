import java.util.*;
public class LEETCODE_448{
       public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> set1=new ArrayList<>();      
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(set.contains(i))continue;
            else{set1.add(i);}
        }
        return set1;
    }
}