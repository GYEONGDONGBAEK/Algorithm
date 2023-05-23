class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int unfinishedCount = 0;
        
        for (boolean isFinished : finished) {
            if (!isFinished) {
                unfinishedCount++;
            }
        }
        
        String[] unfinishedList = new String[unfinishedCount];
        int index = 0;
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                unfinishedList[index] = todo_list[i];
                index++;
            }
        }
        
        return unfinishedList;
    }
}