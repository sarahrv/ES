package consolid9;

public class Calculadora {

    private double resultado;

    public double soma (double a, double b) throws LimiteDeValorException{
        this.resultado = a + b;
        if(this.resultado < 5000){
            return this.resultado;
        } else {
            throw new LimiteDeValorException();
        }
    }

    public double subtracao(double a, double b) throws LimiteDeValorException{
        this.resultado = a - b;
        if(this.resultado < 5000){
            return this.resultado;
        } else {
            throw new LimiteDeValorException();
        }
    }

    public double multiplicacao(double a, double b) throws LimiteDeValorException{
        this.resultado = a * b;
        if(this.resultado < 5000){
            return this.resultado;
        } else {
            throw new LimiteDeValorException();
        }
    }

    public double divisao (double dividendo, double divisor) throws DivisaoPorZeroException, LimiteDeValorException{
        this.resultado = dividendo/divisor;
        if(divisor == 0) {
            throw new DivisaoPorZeroException();
        } else if (this.resultado > 5000 ){
            throw new LimiteDeValorException();
        }
        return dividendo/divisor;
    }


    public static void main(String[] args) throws DivisaoPorZeroException, LimiteDeValorException {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(10,15));
        System.out.println(calculadora.soma(-1,5));
        System.out.println(calculadora.soma(0.5,0.5));
        System.out.println(calculadora.subtracao(5,10));
        System.out.println(calculadora.subtracao(11.8,5.2));
        System.out.println(calculadora.multiplicacao(60,8));
        System.out.println(calculadora.divisao(1,1));
        System.out.println(calculadora.divisao(1,0));
    }
}



