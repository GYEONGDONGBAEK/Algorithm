class Solution {
    public String solution(String polynomial) {
        StringBuilder sb=new StringBuilder();
        int xnum=0,num=0;

        for (String s:polynomial.split(" ")) {
            if (s.contains("x")) // x가 있으면
                xnum+=s.equals("x")? 1:Integer.parseInt(s.replaceAll("x", "")); // 처음에 substring을 썼었는데 계수가 2자리수일때를 생각안했음 
            else if (!s.equals("+"))
                num+=Integer.parseInt(s);
        }
        if(xnum>0) {
            if(xnum==1) sb.append("x");
            else sb.append(xnum).append("x");
                if(num>0) {
                sb.append(" + ");
                sb.append(num);
            }
        }else{
            if(num>0) {
                sb.append(num);
            }
        }
        
            
        
        return sb.toString();
    }
}