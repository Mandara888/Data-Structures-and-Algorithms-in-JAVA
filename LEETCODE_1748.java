import java.util.HashMap;

public class LEETCODE_1748 {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       } 
       int sum=0;
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
    return sum; 
    }
}
