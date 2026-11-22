public class LEETCODE_76{
      public String minWindow(String s, String t) {
        int need[]=new int[128];
        int left=0;
        int bestLen=Integer.MAX_VALUE;
        int bestStart=0;
        int missing=t.length();
        for(char c:t.toCharArray()){
            need[c]++;

        }
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(need[c]>0){
                missing--;
            }
            need[c]--;

            while(missing==0){
                if(right-left+1<bestLen){
                    bestLen=right-left+1;
                    bestStart=left;
                }
                char leftChar=s.charAt(left);
                need[leftChar]++;
                if(need[leftChar]>0){
                    missing++;
                }
                left++;
            }

        }
        return bestLen==Integer.MAX_VALUE?"":s.substring(bestStart,bestStart+bestLen);
    }
}