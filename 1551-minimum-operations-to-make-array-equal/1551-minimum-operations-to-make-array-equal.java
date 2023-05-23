class Solution {
    public int minOperations(int n) {
        int center=n/2;
        return (n%2==0)? center*center:center*(center+1);
    }
}
 

/*
        int ans=0;
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=(2*i)+1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<n){
                while(arr[i]<n){
                    arr[i]++;
                    ans++;
                }
            }else if(arr[i]>n){
                while(arr[i]>n){
                    arr[i]--;
                    ans++;
                }
            }
        }
        return ans/2;

        Time Limit Exceeded => Test case 291번째에서 n이 6376일때 남.
 */