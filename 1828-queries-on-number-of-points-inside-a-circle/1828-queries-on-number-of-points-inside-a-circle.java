class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int []ans =new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int x1=queries[i][0];
            int y1=queries[i][1];
            int r=queries[i][2];
            int cnt=0;
            for(int j=0;j<points.length;j++){
                int x2=points[j][0];
                int y2=points[j][1];
                double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
                if(r>=distance) cnt++;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}

//point에 있는 점이 queries에 몇개 포함되어있는지
//(0,0):2, (0,1):3, (0,2):1,(1,0):4, (1,1):3, (1,2):1, (2,0):1, (2,1):1, (2,2):2