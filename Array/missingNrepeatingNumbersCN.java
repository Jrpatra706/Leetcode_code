import java.util.ArrayList;
import java.util.HashMap;

public class missingNrepeatingNumbersCN {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        // brute
        int ans[] = new int[2];
        int M=0,R=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=1;i<=n;i++){
            map.put(i,0);
        }
        for(int i=0;i<arr.size();i++){
            map.put(arr.get(i), 1+map.getOrDefault(arr.get(i),0));
        }

        Iterator <Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int)it.next();
            if(map.get(key)==0) M=key;
            if(map.get(key)==2) R=key;
        }
        ans[0]=M;
        ans[1]=R;
        return ans;

        // optimal
        int ans[] = new int[2];
        int M=0,R=0;
        long n1 = arr.size();
        long sn = (n1*(n1+1))/2;
        long s2n = (n1*(n1+1)*((2*n1)+1))/6;
        long s=0,s2=0;

        for(int i=0;i<n;i++){
            s+=arr.get(i);
            s2 += (long)arr.get(i) *(long)arr.get(i);

        } 
        int val1 =(int) (s-sn);
        int val2 = (int)(s2-s2n);
        val2 = val2/val1;
        R=(val1+val2)/2;
        M = val2-R;
        ans[0]=M;
        ans[1]=R;
        return ans;
    }
}
