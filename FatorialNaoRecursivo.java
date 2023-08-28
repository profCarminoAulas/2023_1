public class FatorialNaoRecursivo {

    public static int calcularFatorial(int n) {
        int fatorial = 1;
        
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        
        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 5; // Número para calcular o fatorial
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}

