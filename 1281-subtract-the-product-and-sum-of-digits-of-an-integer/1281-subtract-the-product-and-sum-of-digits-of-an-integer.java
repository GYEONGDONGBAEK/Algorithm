class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1, sum=0;
        while(n>0){
            int m=n%10;
            mul*=m;
            sum+=m;
            n /= 10;
        }
        return mul-sum;
    }
}