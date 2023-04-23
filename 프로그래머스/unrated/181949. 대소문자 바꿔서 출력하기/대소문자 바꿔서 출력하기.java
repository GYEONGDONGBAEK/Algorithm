import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] chars = a.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if (Character.isLowerCase(c)) {
                chars[i]=Character.toUpperCase(c);
            } else {
                chars[i]=Character.toLowerCase(c);
            }
        }
        String answer=new String(chars);
        System.out.println(answer);
    }
}