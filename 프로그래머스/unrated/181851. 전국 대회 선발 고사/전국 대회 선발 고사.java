import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
         Map<Integer, Integer>map=new HashMap<>(); // 등수와 인덱스를 매핑하는 HashMap
        
         for (int i=0;i<rank.length;i++) {
            if (attendance[i]){
                map.put(rank[i],i);
            }
         }
        int cnt=0;
        for(int i=0;i<rank.length;i++){
            if(attendance[i]==true){
                cnt++;
            }
        }
        int [] intarr=new int[cnt];
        int index=0;
        for(int i=0;i<rank.length;i++){
            if(attendance[i]==true){
                intarr[index++]=rank[i];
            }
        }
        Arrays.sort(intarr);
        int a=map.get(intarr[0]);
        int b=map.get(intarr[1]);
        int c=map.get(intarr[2]);
        
        return (a*10000)+(b*100)+c;
    }
}

/*
        int cnt=0;
        int len=rank.length;
        for(int i=0;i<len;i++){
            if(attendance[i]==true){
                cnt++;
            }
        }
        int[] intarr=new int[cnt];
        int index=0;
        for(int i=0;i<len;i++){
            if(attendance[i]==true){
                intarr[index++]=rank[i];
            }
        }
        Arrays.sort(intarr);
        return (intarr[0]*10000)+(intarr[1]*100)+intarr[2];
*/