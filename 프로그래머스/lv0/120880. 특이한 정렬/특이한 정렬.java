import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int num : numlist){
            int gap=Math.abs(num-n);
            map.put(num,gap);
        }
        Integer[] numArray=new Integer[numlist.length];
        for (int i=0;i<numlist.length;i++) {
            numArray[i] = numlist[i];
        }
        Arrays.sort(numArray, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int gapA=map.get(a);
                int gapB=map.get(b);
        
                if (gapA==gapB) {
                    return Integer.compare(b,a);
                } else {
                    return Integer.compare(gapA,gapB);
                }
            }
        });
        
        int[] result = new int[numArray.length];
        for (int i=0;i<numArray.length;i++) {
            result[i] = numArray[i];
        }
        
        return result;
    }
}