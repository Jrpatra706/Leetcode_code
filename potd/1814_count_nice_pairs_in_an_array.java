import java.util.HashMap;
class Solution {
    
    public int countNicePairs(int[] nums) {
        int count =0;
        int mod = (int)1e9 + 7;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Long diff = nums[i] - rev(nums[i]);
            if(map.containsKey(diff)){
                count = (count%mod + map.get(diff)%mod)%mod;
            }
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return count;
    }
    public long rev(int num){
        long revnum =0;
        int rem=0;
        while(num>0){
            rem = (num%10);
            revnum =revnum *10 + rem;
            num = num/10;
        }
        return revnum;
    }
    
}
