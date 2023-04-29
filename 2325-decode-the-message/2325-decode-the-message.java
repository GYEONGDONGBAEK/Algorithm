class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        int alp=0;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' '&&!hm.containsKey(ch)){
                hm.put(ch,(char)('a' + alp));
                alp++;
            }
        }
        StringBuffer answer=new StringBuffer();
        for (char c:message.toCharArray()) {
        if (c==' '){
            answer.append(c);
        }else{
            answer.append(hm.get(c));
        }
    }
    return answer.toString();
    }
}

/*처음에 Properties를 쓰려고 했으나, 
암호 해독이 char형식으로 하나씩 해야하기때문에
키와 밸류의 값을 String으로 받는 Properties는 적절하지 않음.
*/