class Solution {
    public String sortSentence(String s) {
        String ans="";
        String [] str=s.split(" ");
        int len=str.length;
        String [] str1=new String[len];
        for(int i=0;i<len;i++){
            int ind=Integer.parseInt(str[i].substring(str[i].length()-1))-1;
            str1[ind]=str[i].substring(0,str[i].length()-1);
        }
        for(int i=0;i<len;i++){
            ans+=str1[i]+" ";
        }

        return ans.trim();
    }
}