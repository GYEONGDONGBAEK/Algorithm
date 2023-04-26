class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false, flag1=true, flag2=true;
        if(x1 ==false &&x2==false) flag1 = false;
        if(x3 ==false &&x4==false) flag2 = false;
        if(flag1 ==true && flag2==true) answer=true;
        return answer;
    }
}