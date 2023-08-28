public class FatorialRecursivo {

    public static int calcularFatorial(int n) {
        // Caso base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Chamada recursiva: fatorial de n é n * fatorial de (n - 1)
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5; // Número para calcular o fatorial
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
