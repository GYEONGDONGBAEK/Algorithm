import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ans=new ArrayList<>();
        String [] cnt=new String[intStrs.length];
        for(int i=0;i<intStrs.length;i++){
            cnt[i]=intStrs[i].substring(s,s+l);
        }
        for(int i=0;i<cnt.length;i++){
            if(Integer.parseInt(cnt[i])>k) ans.add(Integer.parseInt(cnt[i]));
        }
        int[] answer = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}