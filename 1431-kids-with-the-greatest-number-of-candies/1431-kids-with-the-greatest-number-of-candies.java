class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean []answer =new Boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            for(int j=0;j<candies.length;j++){
                if(i!=j&&candies[i]+extraCandies>=candies[j]){
                    answer[i]=true;
                }else if(i!=j&&candies[i]+extraCandies<candies[j]){
                    answer[i]=false;
                    break;
                }
            }
        }
        System.gc();
        return Arrays.asList(answer);
    }
}