class Solution {
    public int solution(int[] arr) {
        int lcm=arr[0];
        
        for (int i=1;i<arr.length;i++) {
            lcm=getLCM(lcm,arr[i]);
        }
        return lcm;
    }
    
    public int getLCM(int a,int b) {
        int A=a;
        int B=b;
         while(a!=0){
            int r=b%a;
            b=a;
            a=r;
        }
        return (A*B)/b;
    }
}