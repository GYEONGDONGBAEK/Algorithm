import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list=new ArrayList<>();

        for (int i=l;i<=r;i++) {
            int number=i;
            boolean flag=true;
            while (number>0) {
                int digit=number % 10;
                if (digit!=0&&digit!= 5) {
                    flag=false;
                    break;
                }
                number/=10;
            }
            if (flag==true) list.add(i);
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer=new int[list.size()];
            for (int i=0;i<list.size();i++) {
                answer[i]=list.get(i);
            }
            return answer;
        }
    }
}