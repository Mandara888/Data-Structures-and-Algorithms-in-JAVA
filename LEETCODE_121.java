public class LEETCODE_121 {
       public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                max=Math.max(profit,max);
            }else{
                buyPrice=prices[i];
            }
        }
        return max;
    }
}
