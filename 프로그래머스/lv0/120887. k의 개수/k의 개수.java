class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str="";
        for(int p=i;p<=j;p++){
            String str1=Integer.toString(p); // 1,2,3,4,5,6,7,8,9,10,11,12,13
            str+=str1; //12345678910111213
        }
        String str2=str.replaceAll("[^"+k+"]","");
        char [] arr=str2.toCharArray(); // ["1","1","1","1","1","1"]
        
        for(int q=0;q<arr.length;q++){
            if(arr[q]-'0'==k){
                answer+=1;
            }
        }
       
     
        
       
        return answer;
    }
}
// 010