class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; // 결과 배열 생성
        
        int top = 0; // 상단 경계
        int bottom = n - 1; // 하단 경계
        int left = 0; // 좌측 경계
        int right = n - 1; // 우측 경계
        int num = 1; // 현재 숫자
        
        while (num<=n*n) {
            // 위쪽 방향
            for (int i=left;i<=right;i++) {
                answer[top][i]=num++;
            }
            top++;// 상단 경계 이동
            
            // 오른쪽 방향
            for (int i=top;i<=bottom;i++) {
                answer[i][right]=num++;
            }
            right--; // 우측 경계 이동
            
            // 아래쪽 방향
            for (int i=right;i>=left;i--) {
                answer[bottom][i]=num++;
            }
            bottom--; // 하단 경계 이동
            
            // 왼쪽 방향
            for (int i=bottom;i>=top;i--) {
                answer[i][left]=num++;
            }
            left++; // 좌측 경계 이동
        }
        
        return answer;
    }
}