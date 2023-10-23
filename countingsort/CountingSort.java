public class CountingSort{
    public static void main( String[] args ){
        int[] arr = {5, 6, 10, 1, 3 ,1 ,7};
        System.out.println("Array não ordenado"); 
        printArray(arr);

        System.out.println("Array ordenado"); 
        countingsort(arr);
        printArray(arr);

    }

    public static void countingsort( int[] arr ){
        int n = arr.length;
        int maior = maior(arr);

        int[] countArray = new int[ maior + 1]; 
        int[] sortArray = new int[n]; 

        // contagem dos elementos do array inicial 
        for( int i = 0; i < n; i++){
            countArray[arr[i]]++;
        }

        // reconstrução do array ordenado 
        int arrord = 0; 
        for( int i = 0; i <= maior; i++){
            while( countArray[i] > 0){
                sortArray[arrord] = i; 
                arrord ++; 
                countArray[i]--;
            }
        }
        System.arraycopy(sortArray, 0, arr, 0, n);
    }

    public static void printArray( int[] arr) {
        for( int i : arr) {
            System.out.print( i + "  ") ;

        }
        System.out.println("");

    }

    public static int maior( int[] arr ){
        int maior= arr[0]; 
        for( int i = 1; i < arr.length; i++){
            if(arr[i] > maior) {
                maior = arr[i];
            }
        }
        return maior; 
    }

}