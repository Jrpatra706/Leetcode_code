import java.util.ArrayList;
import java.util.List;

public class pascalesTriangle118 {
    class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        if(n>1){
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            temp1.add(1);
            ans.add(temp1);
        }
        if(n>2){
            for(int i=2;i<n;i++){
                List<Integer> temp2 = ans.get(i-1);
                List<Integer> temp3 = new ArrayList<>();
                for(int j=0;j<temp2.size();j++){
                    if(j==0){
                        temp3.add(temp2.get(j));
                    }
                    else if(j==temp2.size()-1){
                        temp3.add(temp2.get(j-1)+temp2.get(j));
                        temp3.add(temp2.get(j));
                    }
                    else{
                        temp3.add(temp2.get(j-1)+temp2.get(j));
                    }
                }
                ans.add(temp3);
            }
        }
        return ans;
    }
}
}
