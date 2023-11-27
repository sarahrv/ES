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

    //removendo a main
}



