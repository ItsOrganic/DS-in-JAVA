public class adjgraph {
    private boolean adjMatrix[][];
    private int numVertices;

    //Initialize the matrix
    public adjgraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new boolean[numVertices][numVertices];

    }
    public void addEdge(int src, int dest){
        adjMatrix[src][dest] = true;
        adjMatrix[dest][src] = true;
    }
    //Remove the edges

    public void Remove(int src, int dest){
        adjMatrix[src][dest] = false;
        adjMatrix[dest][src] = false;
    }
    //Print the matrix
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<numVertices;i++){
        s.append(i + ": ");
        for(boolean j: adjMatrix[i]){
            s.append((j?1:0) + " ");
        }
        s.append("\n");
    }
    return s.toString();
}
    // Testing the code
    public static void main(String args[]) {
        adjgraph g = new adjgraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        // g.Remove(2, 3);
        System.out.println(g.toString());
        
    }
}
