public class BuscaSequencial {
    public static int buscaSequencial(int[] array, int chave ){
        for( int i = 0;  i < array.length; i++  ){
            if( array[i] == chave){
                return i; 
            }
        }
        return -1; 
    }

    public static int buscaBinaria(int[] array, int chave){
        int esquerda = 0; 
        int direita = array.length-1;

        while( esquerda <= direita ){
            int meio = esquerda + (direita-esquerda)/2;
            // se a chave está no meio encontramos o elemento
            if(array[meio] == chave){
                return meio;
            }
            // se o elemento do meio é menor do que a chave, ignorar a metade à esquerda
            if(array[meio] < chave){
                esquerda = meio + 1;
            } 
            // se o elemento do meio é maior que a chave, ignorar a metade à direita
            else {
                direita = meio - 1; 
            }
        }
        return -1;
    }

    public static void main( String[] args){
        int[] array = {2,4,7,8,10,16,21};
        int chave = 7; 
        // int elemento = buscaSequencial(array, chave);
        int elemento = buscaBinaria(array, chave);
        if( elemento != -1 ){
            System.out.println("o elemento esta na posição " + elemento + " é " + array[elemento]);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}
