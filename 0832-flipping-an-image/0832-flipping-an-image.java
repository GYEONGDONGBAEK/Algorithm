class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int m=image.length;
         int n=image[0].length;
         for(int i=0;i<m;i++){
             int s=0;
             int e=n-1;
             while(s<=e){
                 int tmp=image[i][s];
                 image[i][s]=image[i][e];
                 image[i][e]=tmp;
                 s++;
                 e--;
             }
         }
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 if(image[i][j]==0) image[i][j]=1;
                 else image[i][j]=0;
             }
         }
         return image;
    }
}