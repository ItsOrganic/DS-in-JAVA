public class graph{

    //  1-Edge
    class Edge{
        int src,dest;
    }

    // Number of vertices and edges
    int vertices,edges;

    //Array to store all the edges
    Edge[] edge;

    //Constructor
    graph(int vertices, int edges){
        this.vertices = vertices;
        this.edges = edges;
    
    //Initialize the edge array
    edge = new Edge[edges];

    for(int i=0;i<edges;i++){
        edge[i] = new Edge();
    }
     
}
//Driver code
public static void main(String[] args) {
    //Creating graph object
    int noVertices = 5;
    int noEdges = 8;
    graph g = new graph(noVertices, noEdges);
    //Creating the edges

    //The edge from 1 to 2
    g.edge[0].src = 1;
    g.edge[0].dest = 2;

    //the edge from 1 to 3
    g.edge[1].src = 1;
    g.edge[1].dest = 3;

    // the edge from 1 to 4
    g.edge[2].src = 1;
    g.edge[2].dest = 4;

    //the edge from 2 to 3
    g.edge[3].src = 2;
    g.edge[3].dest = 3;

    //the edge from 2 to 4
    g.edge[4].src = 2;
    g.edge[4].dest = 4;

    //the edge from 2 to 5
    g.edge[5].src = 2;
    g.edge[5].dest = 5;

    // the edge from 3 to 4
    g.edge[6].src = 3;
    g.edge[6].dest = 4;

    // the edge from 3 to 5
    g.edge[7].src = 3;
    g.edge[7].dest = 5;

    // printing the graph

    for(int i=0;i<noEdges;i++){
        System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
    }


}
}