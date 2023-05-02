import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        while(true){
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0&&arr[i]>=50) arr1[i]=arr1[i]/2;
                else if(arr[i]%2==1&&arr[i]<=50) arr1[i]=arr1[i]*2+1;
                
            }
            if(Arrays.equals(arr,arr1)){
                break;
            }else {
                for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0&&arr[i]>=50) arr[i]=arr[i]/2;
                else if(arr[i]%2==1&&arr[i]<=50) arr[i]=arr[i]*2+1;
                }
            }
            answer++;
        }
        return answer;
    }
}