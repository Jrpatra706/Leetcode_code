class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int truckg=0,truckp=0,truckm=0;
        int lastg=0,lastp=0,lastm=0;
        for(int i=0;i<garbage.length;i++){
            String garb = garbage[i];
            for(int j=0;j<garb.length();j++){
                if(garb.charAt(j)=='G'){
                    truckg++;
                    lastg=i;
                }
                else if(garb.charAt(j)=='P'){
                    truckp++;
                    lastp=i;
                }
                else{
                    truckm++;
                    lastm=i;
                }
            }
        }
        for(int k=0;k<lastg;k++){
            truckg += travel[k];
        }
        for(int k=0;k<lastp;k++){
            truckp += travel[k];
        }
        for(int k=0;k<lastm;k++){
            truckm += travel[k];
        }
        return truckg+truckp+truckm;
    }
}