public class replaceElementWithGreatestInR_1299 {
    class Solution {
        // brute
        public int[] replaceElements(int[] arr) {
            for(int i=0;i<arr.length-1;i++){
                int grt = arr[i+1];
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j] > grt) grt=arr[j];
                }
                arr[i] = grt;
            }
            arr[arr.length-1] = -1;
            return arr;
        }
        // optimal
        public int[] replaceElementsoptimal(int[] arr) {
            int rmax = -1;
            for(int i=arr.length-1;i>=0;i--){
               int nmax = Math.max(rmax,arr[i]);
               arr[i] = rmax;
               rmax = nmax;
            }
            
            return arr;
        }
    }
}
