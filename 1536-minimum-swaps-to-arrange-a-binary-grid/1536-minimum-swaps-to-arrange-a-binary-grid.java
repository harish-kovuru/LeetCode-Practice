class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        List<Integer> zero=new ArrayList<>();
        for(int row[]:grid){
            int trail=0;
            for(int j=n-1;j>=0 && row[j]==0;j--){
                trail++;
            }
            zero.add(trail);
        }

        int swap=0;
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<zero.size();j++){
                if(zero.get(j)>=n-1-i) break;
            }
            if(j==zero.size()) return -1;
            swap+=j;
            zero.remove(j);
        }
        return swap;
    }
}