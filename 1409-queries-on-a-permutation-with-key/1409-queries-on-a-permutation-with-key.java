class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> al = new ArrayList();
        List<Integer> res = new ArrayList();
        for(int i=0;i<m;i++){
            al.add(i+1);
        }
        for(int i=0;i<queries.length;i++){
            res.add(al.indexOf(queries[i]));
            al.remove(al.indexOf(queries[i]));
            al.add(0,queries[i]);
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
