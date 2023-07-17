import java.util.*;

public class  bfsGraph {
   private int v;
   private LinkedList<Integer> adj[];

   bfsGraph(int v){
    this.v = v;
    adj = new LinkedList[v];
    for(int i=0;i<v;i++)
    adj[i] = new LinkedList<>();
   }
   void addEdge(int v,int w){
    adj[v].add(w);
   }
   //BFS ALGORITHM
   void BFS(int s){
    boolean visited[] = new boolean[v];
    LinkedList<Integer> queue = new LinkedList<>();
    visited[s] = true;
    queue.add(s);
    while(queue.size()!=0){
        s=queue.poll();
        System.out.print(s+" ");

        Iterator<Integer> itr = adj[s].listIterator();
        while(itr.hasNext()){
            int n = itr.next();
            if(!visited[n]){
                visited[n] = true;
                queue.add(n); 
            }
        }
    }    
   }
    public static void main(String args[]){
        bfsGraph bfs = new bfsGraph(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);
        bfs.BFS(1);


    }

    
}