class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> answer=new ArrayList<>();
       for (int i = 0; i < nums.length; i++) {
            answer.add(index[i], nums[i]);
       }
       Object [] ans1 = answer.toArray();
       int[] ans = new int[ans1.length];
       for (int i = 0; i < ans1.length; i++) {
            ans[i] = (int) ans1[i];
       }
       System.gc();
       return ans;
    }
}

//add(int index, E element) index 에 element 를 추가하는 메서드