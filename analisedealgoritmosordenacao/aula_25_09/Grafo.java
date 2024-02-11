import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Grafo{
    private int numVertices;
    private List<Map<Integer, Integer>> adjacencias;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adjacencias = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            adjacencias.add(new HashMap<>());
        }
    }

    public void adicionarAresta(int origem, int destino, int peso) {
        adjacencias.get(origem).put(destino, peso);
        adjacencias.get(destino).put(origem, peso); 
    }

    public void imprimirGrafo() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + i + " está conectado a: ");
            for (Map.Entry<Integer, Integer> entry : adjacencias.get(i).entrySet()) {
                int destino = entry.getKey();
                int peso = entry.getValue();
                System.out.print(destino + " (Peso " + peso + ") ");
            }
            System.out.println();
        }
    }

    public void dijkstra(int origem) {
        int[] distancia = new int[numVertices];
        boolean[] visitado = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            distancia[i] = Integer.MAX_VALUE;
            visitado[i] = false;
        }

        distancia[origem] = 0;
        PriorityQueue<Integer> filaPrioridade = 
           new PriorityQueue<>((a, b) -> distancia[a] - distancia[b]);
        filaPrioridade.add(origem);

        while (!filaPrioridade.isEmpty()) {
            int verticeAtual = filaPrioridade.poll();
            if (visitado[verticeAtual]) continue;
            for (Map.Entry<Integer, Integer> vizinho : 
                adjacencias.get(verticeAtual).entrySet()) {
                    int destino = vizinho.getKey();
                    int peso = vizinho.getValue();
                    if (!visitado[destino] && distancia[verticeAtual] != Integer.MAX_VALUE 
                        && distancia[verticeAtual] + peso < distancia[destino]) {
                            distancia[destino] = distancia[verticeAtual] + peso;
                            filaPrioridade.add(destino);
                        }

            }
        }
        System.out.println("Distâncias mínimas a partir do vértice " + origem + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vértice " + i + ": " + distancia[i]);
        }
    }

    public static void main(String[] args ){
        Grafo grafo = new Grafo(6);
        grafo.adicionarAresta(0, 1, 10);
        grafo.adicionarAresta(0, 2, 10);
        grafo.adicionarAresta(1, 2, 2);
        grafo.adicionarAresta(1, 4, 8);
        grafo.adicionarAresta(1, 3, 4);
        grafo.adicionarAresta(2, 4, 9);
        grafo.adicionarAresta(3, 4, 6);
        grafo.adicionarAresta(3, 5, 10);
        grafo.adicionarAresta(4, 5, 10);

        grafo.imprimirGrafo();

        grafo.dijkstra(0);

        grafo.dijkstra(2);
        
    }
}