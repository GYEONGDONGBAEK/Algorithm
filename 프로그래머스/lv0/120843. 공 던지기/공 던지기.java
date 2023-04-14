class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[2*(k-1)%numbers.length];
        return answer;
    }
}

//1 3 2   k=1 numbers[0],k=2 numbers[2] ,k=3 numbers[1], k=4 numbers[0] k=5 numbers[2]
//1 3 1 3 k=1 number[0], k=2 numbers[2] ,k=3 numbers[0] k=4 numbers[2]
//1 3 5
//12345
//1 3 5 2 4  k=1 answer numbers[0] , k=3 numbers[4]
//1 3 5 2 4  k=2 numbers[3] , k=4 numbers[1] , k=5 number[2]
