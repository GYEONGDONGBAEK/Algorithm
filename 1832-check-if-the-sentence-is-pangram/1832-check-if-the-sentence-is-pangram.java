class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans=true;
        int [] a=new int[26];
        for(char ch:sentence.toCharArray()){
           a[ch-'a']++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                ans=false;
                break;
            }
        }
        return ans;
    }
}