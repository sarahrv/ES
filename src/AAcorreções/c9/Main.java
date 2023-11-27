package AAcorreções.c9;

public class Main {

    public static void main(String[] args) throws DivisaoPorZeroException, LimiteDeValorException {
        Calculadora c = new Calculadora();
        c.soma(10, 15);
        c.soma(-1, 5);
        c.soma(0.5, 0.5);
        c.subtração(5, 10);
        c.subtração(11.8, 5.2);
        c.multiplicação(1, 0);
        c.divisão(1, 1);
        c.divisão(1,0);

    }

}