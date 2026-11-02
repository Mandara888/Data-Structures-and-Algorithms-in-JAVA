import java.util.ArrayList;
import java.util.List;

public class LEETCODE_54 {
     public List<Integer> spiralOrder(int[][] matrix) {
        int SC=0;//Starting Column
        int EC=matrix[0].length-1;//Ending Column
        int SR=0;//Starting row
        int ER=matrix.length-1;//Ending row
        List<Integer> list = new ArrayList<>();
        while(SC<=EC && SR<=ER){
            for(int j=SC;j<=EC;j++){
                list.add(matrix[SR][j]);
            }
            for(int i=SR+1;i<=ER;i++){
                list.add(matrix[i][EC]);
                 
            }
           // 3. Traverse Left (only if more than one row remains) 
            if (SR < ER) {
                for(int j=EC-1;j>=SC;j--){
                    list.add(matrix[ER][j]);
                }
            }
            // 4. Traverse Up (only if more than one column remains)
            if (SC < EC) {
                for(int i=ER-1;i>=SR+1;i--){
                    list.add(matrix[i][SC]);
                }
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }
        return list;
    }
}
