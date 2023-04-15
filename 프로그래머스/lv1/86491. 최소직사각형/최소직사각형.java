class Solution {
    public int solution(int[][] sizes) {
        int width=0 , height=0;
        for(int i=0;i<sizes.length;i++){
            if (sizes[i][0]<sizes[i][1]){
                int temp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
                }
            if(sizes[i][0]>width){
                width=sizes[i][0];
            }
            if(sizes[i][1]>height){
                height=sizes[i][1];
            }
        }
        
      
       
        return width*height;
    }
}



//가로 길이가 제일 긴 애를 찾는다.
//그때 가로길이가 세로길이보다 큰애들중에서 제일 세로길이가 큰 놈을 찾음