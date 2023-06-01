class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>(); 
         for(int i=0;i<l.length;i++) {
            int[] arr=Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(arr);
            boolean flag=true;
            for(int j=0; j<arr.length-1; j++){   
                if(arr[j+1]-arr[j] != arr[1]-arr[0]) {
                    flag=false;
                    break;
                }
            }   
            if(flag) ans.add(true); 
            else ans.add(false);        
        }
        return ans;
    }
}