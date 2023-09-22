import java.util.*;

class GrafoValorado {
    class Aresta {
        int v, w, peso;
        Aresta(int v, int w, int peso){
            this.v = v;
            this.w = w;
            this.peso = peso;
        }
    }
    
    private int V; // numero de vertices 
    private LinkedList<Aresta>[] adjacencia; 

    GrafoValorado(int v){
        V = v;
        adjacencia = new LinkedList[v];
        for( int i = 0; i < v ; ++i){
            adjacencia[i] = new LinkedList<>();
        }
    }

    void adicionarAresta(int v, int w, int peso){
        Aresta aresta =  new Aresta(v, w, peso);
        adjacencia[v].add(aresta);
    }

    void mostrarGrafo(){
        for( int i=0; i <V; ++i){
            System.out.print("Vertice " + i + ":");
            for( Aresta aresta : adjacencia[i]){
                System.out.print( aresta.v + " -> " + aresta.w + ", peso: "+ aresta.peso);
            }
            System.out.println();
        }
    }

    public void Busca(int inicio){
        boolean visitados[] = new boolean[V];
        LinkedList<Integer> fila = new LinkedList<>();
        visitados[inicio] = true; 
        fila.add(inicio);
        while(fila.size()!=0){
            inicio = fila.poll();
            System.out.print(inicio + "  "); 
            for(Aresta aresta: adjacencia[inicio]){
                int vizinho = aresta.w;
                if(!visitados[vizinho]){
                    visitados[vizinho] = true;
                    fila.add(vizinho);
                }
            }
        }

    }

    public static void main( String args[]){
        GrafoValorado grafo = new GrafoValorado(4);

        grafo.adicionarAresta(0, 1, 2);
        grafo.adicionarAresta(0, 2, 3);
        grafo.adicionarAresta(1, 2, 1);
        grafo.adicionarAresta(2, 3, 4);

        grafo.mostrarGrafo();

        grafo.Busca(1);
    }
}