package AAcorreções;

public class CalculadoraMDC {

    public static int mdcRecursivo(int a, int b) {
        // Caso base: Se b for igual a 0, retornamos a como o MDC.
        if (b == 0) {
            return a;
        }
        // Chamada recursiva: Chamamos mdcRecursivo com (b, a % b) até que b seja 0.
        return mdcRecursivo(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int resultado = mdcRecursivo(num1, num2);
        System.out.println("O Máximo Divisor Comum de " + num1 + " e " + num2 + " é " + resultado);
    }
}
