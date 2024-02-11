import java.util.*;

class MaxFlow {
    private int V;                // Número de vértices no grafo
    private ArrayList<Edge>[] adj; // Lista de adjacência para representar o grafo

    MaxFlow(int V) {
        this.V = V;
        this.adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // Classe para representar as arestas do grafo
    class Edge {
        int v;            // Vértice de destino
        int capacity;     // Capacidade da aresta
        int flow;         // Fluxo atual

        Edge(int v, int capacity) {
            this.v = v;
            this.capacity = capacity;
            this.flow = 0;
        }
    }

    // Adiciona uma aresta ao grafo
    void addEdge(int u, int v, int capacity) {
        Edge forwardEdge = new Edge(v, capacity);
        Edge backwardEdge = new Edge(u, 0); // Cria uma aresta residual
        forwardEdge.flow = 0;
        backwardEdge.flow = 0;
        adj[u].add(forwardEdge);
        adj[v].add(backwardEdge);
    }

    // Encontra um caminho aumentante usando busca em largura (BFS)
    private boolean bfs(int source, int sink, int[] parent) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (Edge e : adj[u]) {
                int v = e.v;
                if (!visited[v] && e.capacity - e.flow > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
        return visited[sink];
    }

    // Encontra o fluxo máximo no grafo
    int maxFlow(int source, int sink) {
        int[] parent = new int[V];
        int maxFlow = 0;

        while (bfs(source, sink, parent)) {
            int pathFlow = Integer.MAX_VALUE;
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                for (Edge e : adj[u]) {
                    if (e.v == v) {
                        pathFlow = Math.min(pathFlow, e.capacity - e.flow);
                        break;
                    }
                }
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                for (Edge e : adj[u]) {
                    if (e.v == v) {
                        e.flow += pathFlow;
                        break;
                    }
                }
            }

            maxFlow += pathFlow;
        }
        return maxFlow;
    }

    public static void main(String[] args) {
        MaxFlow graph = new MaxFlow(6);

        // Adicione as arestas do grafo com suas capacidades
        graph.addEdge(0, 1, 16);
        graph.addEdge(0, 2, 13);
        graph.addEdge(1, 2, 10);
        graph.addEdge(1, 3, 12);
        graph.addEdge(2, 1, 4);
        graph.addEdge(2, 4, 14);
        graph.addEdge(3, 2, 9);
        graph.addEdge(3, 5, 20);
        graph.addEdge(4, 3, 7);
        graph.addEdge(4, 5, 4);

        int source = 0;
        int sink = 5;
        int maxFlow = graph.maxFlow(source, sink);

        System.out.println("Fluxo Máximo: " + maxFlow);
    }
}
