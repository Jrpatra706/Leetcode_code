package twoPointers;

public class isSubsequence_392 {
    class Solution {
        // optimal
        public boolean isSubsequence(String s, String t) {
            int i=0,j=0;
            while(i<s.length() && j<t.length()){
                if(s.charAt(i) == t.charAt(j)) i++;
                j++;
            }
            if(i == s.length()) return true;
            return false;
        }
        // brute
         public boolean isSubsequencebrute(String s, String t) {
            int cnt=0,mark=0;
            for(int i=0;i<s.length();i++){
                for(int j=mark;j<t.length();j++){
                    if(s.charAt(i) == t.charAt(j)){
                        cnt++;
                        mark=j+1;
                        break;
                    }
                }
            }
            if(cnt == s.length()) return true;
            return false;
        }
    }
}
