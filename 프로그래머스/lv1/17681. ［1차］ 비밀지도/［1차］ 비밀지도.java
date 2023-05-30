class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1=new String[n];
        String[] str2=new String[n];
        for(int i=0;i<n;i++){
            //n의 길이만큼 만들고 수로 채워져있지 않은곳은 공백이 되고 그 공백을 0으로 만들어서 문제에서 요구하는 2진수 문자열이 되게 하는 메서드
            str1[i] = String.format("%"+n+"s",Integer.toBinaryString(arr1[i])).replace(" ", "0");
            str2[i] = String.format("%"+n+"s",Integer.toBinaryString(arr2[i])).replace(" ", "0");
            str1[i]=str1[i].replace("1","#");
            str2[i]=str2[i].replace("1","#");
        }
         for (int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for (int j=0;j<n;j++){
                if (str1[i].charAt(j)=='#'||str2[i].charAt(j)=='#'){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i]=sb.toString();
         }
        return answer;
    }
}

//숫자를 이진수로 바꿔서 배열에 넣고 인덱스의 값이 1인경우 #으로 바꿔서 넣는다

/*
if (length < 5) {
    binaryString = "0".repeat(5 - length) + binaryString;
} 1 이나 앞에 0이 붙어야 할 수들에게 0을 붙여줄 수 있는 메서드
*/
