public class LEETCODE_69{
       public int mySqrt(int x) {
      long lo=1;
       long hi=x;
        if(x==0)return 0;
    while(lo<=hi){
        long mid=(lo+hi)/2;
        if((mid*mid)>x){
            hi=(mid-1);
        }
        else if((mid*mid)==x){
            return(int) mid;
        }
        else if((mid*mid)<x){
            lo=(mid+1);
        }
       }
        return (int) hi;
    }
}