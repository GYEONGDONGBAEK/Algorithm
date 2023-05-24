class Solution {
    public String makeSmallestPalindrome(String s) {
         char[] cstr=s.toCharArray();
         int left=0;
         int right=cstr.length - 1;

         while (left< right) {
              if (cstr[left]<cstr[right]) cstr[right--]=cstr[left++];
              else cstr[left++]=cstr[right--];
         }

        String ans="";
        for(char c:cstr){
            ans+=c;
        }
        return ans;
    }
}

//Lexicographically Smallest Palindrome=> 사전학적으로 가장 작은 고생대 ? 사전식으로 가장 작은 