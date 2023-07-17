import java.util.Iterator;
import java.util.LinkedList;

public class dfsGraph{
    private LinkedList adjLists[];
    private boolean visited[];
    
    public dfsGraph(int vertices){
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for(int i =0;i<vertices;i++){
            adjLists[i] = new LinkedList();
        }
    }
    //Adding edges
    void addEdge(int src, int dest){
        adjLists[src].add(dest);
    }
    void DFS(int vertex){
         visited[vertex] = true;
         System.out.println(vertex + " ");
         Iterator<Integer> iterator = adjLists[vertex].listIterator();
         while(iterator.hasNext()){
            int adj = iterator.next();
            if(!visited[adj])
            DFS(adj);
         }
    }
    public static void main(String args[]) {
        dfsGraph g= new dfsGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        System.out.printf("First traversal fron %d position \n",0);
        g.DFS(0);
    }   
}
