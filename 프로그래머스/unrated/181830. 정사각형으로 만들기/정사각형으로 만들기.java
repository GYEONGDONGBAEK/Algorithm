import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer=new int[max][max];

        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                answer[i][j]=arr[i][j];
            }
        }

        return answer;
    }
}

/*
int rows = arr.length;
        int cols = arr[0].length;
        
        
        if (rows<cols){ //행의 수가 열의 수보다 작을 경우
            int[][] newarr=new int[cols][cols];
            for (int i=0;i<rows;i++) {
                newarr[i]=Arrays.copyOf(arr[i],cols);
            }
            return newarr;
        }
        
        if (cols<rows) { //열의 수가 행의 수보다 작을경우
            int[][] newarr=new int[rows][rows];
            for (int i=0;i<rows;i++) {
                newarr[i]=Arrays.copyOf(arr[i],cols);
                newarr[i]=Arrays.copyOf(newarr[i],rows);
            }
            return newarr;
        }
        return arr; //행의 수와 열의 수가 같을 경우
*/