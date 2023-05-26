class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int nu=(numer1*denom2)+(numer2*denom1) , de=denom1*denom2;
        int denominator=de, numerator=nu;
        while (denominator!=0) {
            int re=numerator%denominator;
            numerator=denominator;
            denominator=re;
        }
        int[] answer=new int[2];
        answer[0]=nu/numerator;
        answer[1]=de/numerator;
        return answer;
    }
}