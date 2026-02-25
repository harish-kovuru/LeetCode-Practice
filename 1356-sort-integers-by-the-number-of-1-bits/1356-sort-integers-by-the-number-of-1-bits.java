class Solution {
    private int fun(int n){
        int one=0;
        while(n>0){
            one+=(n&1);
            n=n>>1;
        }
        return one;
    }
    public int[] sortByBits(int[] arr) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int max=0;
        for(int element:arr){
            int count=fun(element);
            max=Math.max(count,max);
            map.computeIfAbsent(count,k->new ArrayList<>()).add(element);
        }
        int j=0;
        for(int i=0;i<=max;i++){
            List<Integer> temp=map.get(i);
            if(temp==null) continue;
            Collections.sort(temp);
            for(int e:temp){
                arr[j++]=e;
            }
        }
        return arr;
    }
}