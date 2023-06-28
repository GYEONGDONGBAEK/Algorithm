import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int size=0;
        for (int t:tangerine) {
            size=Math.max(t, size);
        }
        
        int[] cnt=new int[size+1];  //크기별 귤의 개수 저장하는 배열
        
        for (int i=0;i<tangerine.length;i++) {
            cnt[tangerine[i]]+=1;  //인덱스가 귤의 크기
        }
        Arrays.sort(cnt);
        int sum=0;
        int count=0;
        
        for (int i=size;i>=1;i--) {
            sum += cnt[i];
            count++;
            if (sum>=k) {
	             break;
            }
            
        }
        return count;
    }
}