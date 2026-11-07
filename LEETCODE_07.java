public class LEETCODE_07 {
        public int reverse(int x) {
         long reverseInteger=0;
     
        while(x!=0){
            reverseInteger=(reverseInteger*10)+x%10;
            x/=10;
        }
           if(  reverseInteger< Integer.MIN_VALUE ||  reverseInteger > Integer.MAX_VALUE){
            return 0;
        }
    return (int)reverseInteger;
    }
}
