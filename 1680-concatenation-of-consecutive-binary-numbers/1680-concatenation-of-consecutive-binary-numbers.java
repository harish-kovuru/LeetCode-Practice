class Solution {
    public int concatenatedBinary(int n) {
        long mod=1_000_000_007L;
        long ans=0;
        int bitlen=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) bitlen++;
            ans=((ans<<bitlen)+i)%mod;
        }
        return (int) ans;
    }
}