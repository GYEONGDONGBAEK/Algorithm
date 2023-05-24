import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer=new int[2];
        HashSet<String> set=new HashSet<>();
        
        for (int i=0;i<words.length;i++) {
            // 이전 단어의 마지막 문자와 현재 단어의 첫 번째 문자가 같은지 확인
            if (i>0&&words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)||set.contains(words[i])) {
                answer[0] = (i%n)+1; // 탈락한 사람의 번호
                answer[1] = (i/n)+1; // 탈락한 사람의 차례
                break;
            }
                set.add(words[i]);
        }
        return answer;
    }
}

/*
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer=new int[2];
        HashSet<String> set=new HashSet<>();
        
        for (int i=1;i<words.length;i++) {
            // 이전 단어의 마지막 문자와 현재 단어의 첫 번째 문자가 같은지 확인
            if (&&words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)||set.contains(words[i])) {
                answer[0] = (i%n)+1; // 탈락한 사람의 번호
                answer[1] = (i/n)+1; // 탈락한 사람의 차례
                break;
            }
                set.add(words[i]);
        }
        return answer;
    }
}    for문을 돌때 처음에 words 인덱스의 0을 안돌아서 tank가 입력이 안되서 [0,0] 이 나옴.
*/