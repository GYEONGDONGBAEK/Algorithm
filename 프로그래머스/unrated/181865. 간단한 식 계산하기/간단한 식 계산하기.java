class Solution {
    public int solution(String binomial) {
        int ans=0;
        String[] str=binomial.split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[2]);
        char op=str[1].charAt(0);
        switch (op) {
            case '+':
                ans=a+b;
                break;
            case '-':
                ans=a-b;
                break;
            case '*':
                ans=a*b;
                break;
        }
        return ans;
    }
}