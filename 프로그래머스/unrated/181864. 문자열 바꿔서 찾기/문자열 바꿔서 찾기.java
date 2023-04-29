class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String rep=myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        if(rep.contains(pat)) answer=1;
        return answer;
    }
}



/*
int answer = 0;
        String str="";
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='A') str+=myString.replace(myString.charAt(i),'B');
            else str+=myString.replace(myString.charAt(i),'A');
        }
        if(str.contains(pat)) answer=1;
        return answer;
    }
}
*/