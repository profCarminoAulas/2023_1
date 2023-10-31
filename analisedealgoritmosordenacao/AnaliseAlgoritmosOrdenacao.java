import java.io.FileWriter;
import java.util.Random;

public class AnaliseAlgoritmosOrdenacao{
    private static long operacoesSelectionSort = 0; 
    private static long operacoesInsertionSort = 0; 
    private static long operacoesShellSort = 0; 


    public static void main(String[] args){
        int[] tamnhos = { 100, 200, 300, 400, 500, 600, 700, 800 }; 
        String[] ordens = {"Crescente", "Decrescente", "Aleatoria"};
        try {
            FileWriter csvWriter = new FileWriter("joao.csv"); 
            csvWriter.append("Tamanho, Ordem, Algoritmo, Operecoes, Tempo (ns)\n");
            for( int tamanho: tamnhos){ 
                for(String ordem : ordens) { 
                    int[] arr = gerarVetor(tamanho, ordem);
                    analisaEgrava(csvWriter, tamanho, ordem, "Selection Sort", arr);
                    analisaEgrava(csvWriter, tamanho, ordem, "Insertion Sort", arr);
                    analisaEgrava(csvWriter, tamanho, ordem, "Shell Sort", arr);
                }
            }

            csvWriter.flush();
            csvWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] gerarVetor(int tamanho, String ordem){ 
        if( ordem.equals("Crescente")) {
            return gerarVetorCrescente(tamanho);
        } else if( ordem.equals("Decrescente")) {
            return gerarVetorDecrescente(tamanho);
        } else { 
            return gerarVetorAleatorio(tamanho);
        }
    }

    public static void analisaEgrava( FileWriter csvWriter, int tamanho, String ordem, String algoritmo, int[] arr ){
        long tempInicial, tempoFinal;
        long duracao; 

        int[] arrCopia = arr.clone();

        if(algoritmo.equals("Selection Sort")){
            tempInicial = System.nanoTime();
            selectionSort(arrCopia);
            tempoFinal = System.nanoTime();
        } else if(algoritmo.equals("Insertion Sort")){
            tempInicial = System.nanoTime();
            insertionSort(arrCopia);
            tempoFinal = System.nanoTime();
        } else {
            tempInicial = System.nanoTime();
            shellSort(arrCopia);
            tempoFinal = System.nanoTime();
        }

        duracao = (tempoFinal - tempInicial);

        System.out.println("inicio " + tempInicial +  " final " + tempoFinal + " duracao " + duracao);

        try {
            csvWriter.append( tamanho + "," + ordem + "," + algoritmo + "," + getContarOperacoes(algoritmo) + "," + duracao + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] gerarVetorCrescente( int tamanho) {
        int[] arr = new int[tamanho]; 
        for(int i = 0; i < tamanho; i++){ 
            arr[i] = i;
        }
        return arr; 
    }

    public static int[] gerarVetorDecrescente( int tamanho) {
        int[] arr = new int[tamanho]; 
        for(int i = 0; i < tamanho; i++){ 
            arr[i] = tamanho - i;
        }
        return arr; 
    }

    public static int[] gerarVetorAleatorio( int tamanho ){
        int[] arr = new int[tamanho]; 
        Random random = new Random(); 
        for(int i = 0; i < tamanho; i++){
            arr[i] =  random.nextInt(tamanho);
        }
        return arr;
    }


    // 0  1  2  3  4  5  6  7  8  9
    // 0, 3 ,1, 8, 7, 2, 5, 4, 9 ,6 

    public static void selectionSort( int[] arr ){
        int n = arr.length;
        for( int i = 0; i < n -1; i++){
            int minIndex = i; 
            for(int j = i +1; j < n; j++){
                operacoesSelectionSort++;
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static long getContarOperacoes(String algoritmo){
        if(algoritmo.equals("Selection Sort")){
            return operacoesSelectionSort;
        } else if(algoritmo.equals("Insertion Sort")){
            return operacoesInsertionSort;
        } else { 
            return operacoesShellSort;
        }
    }

    public static void resetContarOperacoes(String algoritmo){
        if(algoritmo.equals("Selection Sort")){
            operacoesSelectionSort = 0;
        } else if(algoritmo.equals("Insertion Sort")){
            operacoesInsertionSort = 0;
        } else { 
            operacoesShellSort = 0;
        }
    }

    public static void insertionSort( int[] arr){
        int n = arr.length; 
        for( int i = 1;  i < n; i++){
            int chave = arr[i]; 
            int j = i -1;
            while( j >= 0 && arr[j] > chave ){
                operacoesInsertionSort++;
                arr[ j + 1] = arr[j];
                j = j - 1; 
            }
            arr[ j + 1] = chave; 

        }
    }

    public static void shellSort( int[] arr) {
        int n = arr.length; 
        for( int gap = n/2; gap > 0; gap /= 2){
            for( int i = gap; i < n; i++){
                int temp = arr[i]; 
                int j; 
                for( j = i; j >= gap && arr[j - gap] > temp; j -= gap){
                    operacoesShellSort+=2; 
                    arr[j] = arr[j - gap]; 
                }
                arr[j]= temp; 
            }
        }
    }

}