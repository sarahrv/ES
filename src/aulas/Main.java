package aulas;

import aulas.Conta;
import aulas.ContaPJ;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("123-4");
        Conta conta2 = new ContaPJ("567-8", 0.01);

        ((ContaPJ)conta2).setCpmf(0.01);
        conta1.creditar(10);
        System.out.println(conta1);
        System.out.println(conta2);

        conta2.creditar(20);
        System.out.println(conta1);
        System.out.println(conta2);

        conta1.transferir(conta2,5);
        System.out.println(conta1);
        System.out.println(conta2);

        conta2.debitar(15);
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
    /*String x = "Pernambuco";
    String y = x.substring(0,5);
    String z = x.substring(6);
    int indice = x.indexOf("na");
    char letra = x.charAt(5);
        System.out.println(letra);*/