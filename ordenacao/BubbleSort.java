public class BubbleSort {
    public static void main( String[] args ){
        // posição    0,  1, 
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 17};
        System.out.println(System.currentTimeMillis());
        imprimirArray(arr);
        //bubbleSort(arr);
        quickSort(arr, 0, arr.length - 1);
        imprimirArray(arr);
        System.out.println(System.currentTimeMillis());
    }
    
    public static void quickSort( int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi -1 );
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; // pivo 
        int i = (low -1); // Indice do menor elemento
        for( int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
        }
        int tmp = arr[ i + 1]; 
        arr[i + 1]= arr[high];
        arr[high] = tmp; 
        return i+1; 
    }

    public static void bubbleSort( int[] arr){ 
        int n = arr.length;
        int contador = 0; 
        boolean mudanca; 
        for( int i = 0; i < n -1; i++){
            mudanca = false; 
            for( int j = 0; j < n - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = tmp; 
                    mudanca = true; 
                    
                }
                contador += 1; 
            }
        }
        System.out.println(" contador " + contador);
    }

    public static void imprimirArray( int[] arr ){ 
        for(int i =0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}