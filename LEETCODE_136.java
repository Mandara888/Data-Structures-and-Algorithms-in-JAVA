public class LEETCODE_136 {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int num:nums){
            unique^=num;
        }
        return unique;
    }
}
//iteration 1:num=10^0=10;
//iteration 2:num=10^10=0;
//iteration 1:num=1^0=01;

