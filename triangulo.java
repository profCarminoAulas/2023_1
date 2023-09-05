public class triangulo {

    
    public static void main(String[] args) {
        triangoIterado(1);
        triangoIterado(2);
        triangoIterado(3);
        triangoIterado(4);
        trianguloFormula(4);
        System.out.println( "recursivo " + trianguloRecursivo(4));
    }

    public static void triangoIterado(int n ){
        int total=0; 
        while( n> 0){
            total = total + n; 
            n = n - 1;
        }
        System.out.println("Iterado " + total) ;
    }

    public static int trianguloRecursivo( int n ){
        if(n == 1) {
            return n; 
        } else {
            return n + trianguloRecursivo(n-1); 
        }
    }

    public static int triangoRecTernario( int n) {
        return n == 1 ? n : n + triangoRecTernario(n-1);
    }

    public static void trianguloFormula( int n){
        System.out.println("formula " + n*(n+1)/2);

    }
}