class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] answer=new int[nums.length];
        for(int i=0;i<n;i++){
            answer[2*i]=nums[i];
            answer[(2*i)+1]=nums[n+i];
        }
        return answer;
    }
}

//x1,x2,...Xn , Y1,Y2....,y=Yn
//x1 0=>0 x2 1=>2  x3 2=>4 x4 3=>6 x5 4=>8
//y1 n+1=>1 y2 n+2>3 y3 n+3>5
// x 0 1 2 3 4 5 => 0 2 4 6 8 10 12
// y n n+1 n+2 n+3 n+4=> 1 3 5 7 9