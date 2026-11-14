import java.util.ArrayList;
import java.util.List;

public class LEETCODE_118 {
         public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        long ans=1;
        for(int col=0;col<rowIndex;col++){
            ans=ans*(rowIndex-col);
            ans= ans/(col+1);
            list.add((int)ans); 
          }
          return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        n.add(1);
        res.add(n);
        
        for(int i=1;i<numRows;i++){
           res.add( getRow(i));
        }
        return res;
    }
}
