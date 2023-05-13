class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            String s=words[i];
            for(char c:s.toCharArray()){
                sb.append(morse[c-'a']);
            }
            words[i]=sb.toString();
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            for (int j=i+1;j<words.length;j++) {
                if (words[i].equals(words[j])) {
                    flag=false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }
        }
        return ans;
    }
}

// 모스 배열을 선언하고 words의 배열의 원소를 각각 charAt쓰고 아스키 코드의 'a'빼서 int로 바꿔주고 난후
// 모스배열에서 그값을 찾아서 넣어줌. 그 뒤 같은지 안같은지를 비교함.