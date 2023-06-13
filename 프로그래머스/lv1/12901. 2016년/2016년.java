class Solution {
    public String solution(int a, int b) {
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] daysOfMonth={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int days=0;
        for (int i=0;i<a-1;i++) {
            days+=daysOfMonth[i];
        }
        days+=b-1;
        
        int cnt=(days%7);
        return daysOfWeek[cnt];
    }
}