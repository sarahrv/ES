package AAcorreções.c9;

public class Calculadora {



    public void soma(double num1, double num2) throws LimiteDeValorException {
        double soma = num1 + num2;
        if(soma > 5000) {
            throw new LimiteDeValorException();
        }
        else
            System.out.printf("O resultado da soma é: %.2f \n", soma);
    }

    public void subtração(double num1, double num2) throws LimiteDeValorException {
        double diferença = num1 - num2;
        if(diferença > 5000) {
            throw new LimiteDeValorException();
        }
        else
            System.out.printf("O resultado da subtração é: %.2f \n", diferença);
    }

    public void multiplicação(double num1, double num2) throws LimiteDeValorException {
        double produto = num1 * num2;
        if(produto > 5000) {
            throw new LimiteDeValorException();
        }
        else
            System.out.printf("O resultado do produto é: %.2f \n", produto);
    }

    public void divisão(double num1, double num2) throws DivisaoPorZeroException, LimiteDeValorException {
        double divisão = num1 / num2;
        if(num2 == 0) {
            throw new DivisaoPorZeroException();
        }
        else if(divisão > 5000){
            throw new LimiteDeValorException();
        }
        else
            System.out.printf("O resultado da divisão é: %.2f \n", divisão);
    }

}
