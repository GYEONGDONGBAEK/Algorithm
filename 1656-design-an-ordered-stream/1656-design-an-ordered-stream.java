class OrderedStream {
    private String[] str;
    private int ptr;

    public OrderedStream(int n) {
        str= new String[n];
        ptr=0;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> ans=new ArrayList<>();
        str[idKey - 1] = value;
        for (int i=ptr;i<str.length;i++) {
            if (str[i]!=null) {
                ans.add(str[i]);
                ptr++;
            } else{
                break;
            }
        }
        return ans;
        }
    
}
/* 3번째(인덱스:2)에 ccccc 저장 [] ptr(인덱스)은 0
   1번째(인덱스:0)에 aaaaa 저장 [],[aaaaa] 저장 ptr(인덱스)이 1이됨.
   2번째(인덱스:1)에 bbbbb 저장 [],[aaaaa],[bbbbb,ccccc] ptr(인덱스)이 3
   5번째(인덱스:4)에 eeeee 저장 [],[aaaaa].[bbbbb,ccccc],[] ptr(인덱스) 3
   4번째(인덱스:3)에 ddddd 저장 [],[aaaaa],[bbbbb,ccccc],[],[ddddd,eeeee]
 */


/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */