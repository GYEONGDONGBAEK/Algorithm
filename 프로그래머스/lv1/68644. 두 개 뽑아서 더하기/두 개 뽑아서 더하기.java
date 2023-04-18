import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer=new Integer[set.size()];
        set.toArray(answer);
        return answer;
    }
}

/*
public int[] solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순 정렬
        List<Integer> list=new ArrayList<>();
        int left=0,right=numbers.length-1;
        
        while (left<right) {
            int sum=numbers[left]+numbers[right];
            if (!list.contains(sum)) {  중복된 값은 저장하지 않음
                list.add(sum);
            }
            100을 기준으로
            if (sum<=100) {  두 수의 합이 100보다 작거나 같은 경우
                left++;
            }else{ 두 수의 합이 100보다 큰 경우
                right--;
            }
        }
        
        Collections.sort(list);
        int[] answer=new int[list.size()];
        for (int i=0;i<list.size();i++) {
            answer[i]=list.get(i);
        }
        return answer;
*/