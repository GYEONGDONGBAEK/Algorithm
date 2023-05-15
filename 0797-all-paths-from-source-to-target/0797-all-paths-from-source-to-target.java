import java.util.*;
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths=new ArrayList<>();
        int target=graph.length-1;
        
        Queue<List<Integer>> queue=new LinkedList<>();
        queue.offer(Arrays.asList(0)); // 시작 노드인 0을 큐에 추가
        
        while(!queue.isEmpty()) {
            List<Integer> path=queue.poll(); //큐에 들어있는 노드 꺼내기
            int lastNode=path.get(path.size() - 1);
            
            if (lastNode == target) { // 도착 노드에 도달한 경우
                paths.add(path); // 현재까지의 경로를 결과에 추가
            } else {
                for (int j=0;j<graph[lastNode].length;j++) {
                    int nextNode = graph[lastNode][j];
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(nextNode); // 다음 노드를 경로에 추가
                    queue.offer(newPath); // 다음 노드를 큐에 추가
            }
          } 
        }
        return paths;
    }
}

/* 
큐 : [0,4][0,3,4][0,1,4]

결과:
*/