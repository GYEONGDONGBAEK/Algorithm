class Solution {
    public int[] solution(String s) {
        int n=s.length();
        int[] answer=new int[n];
        
        for (int i=0;i<n;i++) {
            char c=s.charAt(i);
            int index=s.substring(0, i).lastIndexOf(c);
            
            if (index<0) answer[i]=-1;
            else answer[i]=i-index;
            
        }
        return answer;
    }
}

/*
        int n=s.length();
        int[] answer=new int[n];

        for (int i=0;i<n;i++) {
            char c=s.charAt(i);
            int index=s.indexOf(c, 0);

            if (index<i) answer[i]=i-index;
            else answer[i]=-1;
            
        }
        return answer;
int index=s.indexOf(c,0) 이 항상 처음부터 진행하기때문에 banana에서 [-1,-1,-1,2,2,4] 값이 나옴
*/