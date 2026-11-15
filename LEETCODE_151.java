public class LEETCODE_151{
       public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        String ans[]=s.split("\\s+");
        int n=ans.length;
        for(int i=0;i<ans.length/2;i++){
            String temp=ans[i];
            ans[i]=ans[n-i-1];
            ans[n-i-1]=temp;
        }
        for(String i:ans){
            sb.append(i).append(" ");
        }
        String result=sb.toString().trim();
        return result;
    }
}