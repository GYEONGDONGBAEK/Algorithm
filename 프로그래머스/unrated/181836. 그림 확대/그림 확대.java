class Solution {
    public String[] solution(String[] picture, int k) {
        int rows=picture.length;
        int cols=picture[0].length();
        int newRows=rows*k;
        int newCols=cols*k;

        String[] ans=new String[newRows];

        for (int i=0;i<newRows;i++) {
            StringBuilder sb=new StringBuilder();
            for (int j=0;j<newCols;j++) {
                int row=i/k;
                int col=j/k;
                char pixel=picture[row].charAt(col);
                sb.append(pixel);
            }
            ans[i]=sb.toString();
        }

        return ans;
    }
}