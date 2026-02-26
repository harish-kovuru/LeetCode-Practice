class Solution {
    public int numSteps(String s) {
        int n=s.length();
        if(n==1) return 0;

        int carry=0;
        int step=0;
        for(int i=n-1;i>=1;i--){
            int bit=s.charAt(i)-'0' + carry;
            if(bit==0 ||bit==2){
                step++;
            }else{
                step+=2;
                carry=1;
            }
        }
        return step+carry;
    }
}