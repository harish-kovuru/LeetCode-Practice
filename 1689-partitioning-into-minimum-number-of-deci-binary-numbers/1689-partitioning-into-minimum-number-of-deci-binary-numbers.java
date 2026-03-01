class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(char num : n.toCharArray()){
            ans=Math.max(ans,num-'0');
        }
        return ans;
    }
}