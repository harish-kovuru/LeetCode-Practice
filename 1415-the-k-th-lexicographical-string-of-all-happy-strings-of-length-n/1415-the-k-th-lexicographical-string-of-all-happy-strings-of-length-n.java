class Solution {
    public String getHappyString(int n, int k) {
        List<String> list=new ArrayList<>();
        happy(n,list,"");
        if(list.size()<k) return "";

        return list.get(k-1);
    }
    private void happy(int n,List<String> list,String res){
        if(res.length()==n){
            list.add(res);
            return;
        }
        for(char ch='a';ch<='c';ch++){
            if(res.length()>0 && res.charAt(res.length()-1)==ch) continue;
            happy(n,list,res+ch);
        }
    }
}