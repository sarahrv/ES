package consolid9;

public class LimiteDeValorException extends Exception{
    public LimiteDeValorException(){
        super("O limite de resultado das operações eh 5000");
    }
}
