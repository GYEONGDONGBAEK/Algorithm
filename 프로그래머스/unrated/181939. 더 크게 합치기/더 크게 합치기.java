class Solution {
    public int solution(int a, int b) {
        int answer=0;
        String astr=Integer.toString(a);
        String bstr=Integer.toString(b);
        if(Integer.parseInt(astr+bstr)>=Integer.parseInt(bstr+astr)){
            answer=Integer.parseInt(astr+bstr);
        }else{
            answer=Integer.parseInt(bstr+astr);
        }
        return answer;
    }
}