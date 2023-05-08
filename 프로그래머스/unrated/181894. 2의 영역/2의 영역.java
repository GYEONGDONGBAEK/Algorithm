class Solution {
    public int[] solution(int[] arr) {
        int start=-1;
        int end=-1;
        boolean flag = false;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]==2) {
                if (!flag) {
                    start=i;
                    end=i;
                    flag=true;
                } else {
                    end=i;
                }
            }
        }

        if (!flag) {
            return new int[] {-1};
        }

        int[] answer = new int[end-start+1];
        for (int i=0;i<answer.length;i++) {
            answer[i] = arr[start+i];
        }

        return answer;
    }
}
/*
boolean check=false;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2) check=true;
            while(check){
                list.add(arr[i++]);
                if(arr[i]==2) check=false;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
2 가 배열의 마지막 원소일때거나 2가 배열에 한개밖에 없을때는 java.lang.ArrayIndexOutOfBoundsException 오류가 난다.
*/

/*
 String str = "";
        for (int num:arr){
            str+=num;
        }
        int start = str.indexOf("2");
        int end = str.lastIndexOf("2");

        if (start==-1) {
            return new int[] {-1};
        }
        String str1=str.substring(start,end+1);
        String[] arr1 = str1.split("");
        
        int[] answer=new int[arr1.length];
        for (int i=0;i<arr1.length;i++) {
            answer[i]=Integer.parseInt(arr1[i]);
        }

        return answer;
    }
}
숫자가 10일때는 1과 0으로 나뉘기 때문에 오류가난다.
*/