import java.util.*;
class Solution {
    public int minimumSum(int num) {
        String[] s=String.valueOf(num).split("");
        Arrays.sort(s);
        int num1= Integer.parseInt(s[0])*10+Integer.parseInt(s[2]);
        int num2= Integer.parseInt(s[1])*10+Integer.parseInt(s[3]);

        System.gc();
        return num1+num2;  
    }
}


/*
int arr[] = new int[4];
        int n = num;
        for(int i = 0; i < 4; i++) {
            arr[i] = n%10;
            n = n/10;
        }
        Arrays.sort(arr);
        int num1 = arr[0]*10 + arr[3];
        int num2 = arr[1]*10 + arr[2];
        return num1 + num2;
 */