import java.util.Scanner;

public class Graph_01 {

    int[][] adjMatrix;

    public Graph_01(int nodes) {
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1; // undirected graph
    }

    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int nodes = sc.nextInt();

        Graph_01 g = new Graph_01(nodes);

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }

        g.printMatrix(); // print once after all edges are added

        sc.close();
    }
}
