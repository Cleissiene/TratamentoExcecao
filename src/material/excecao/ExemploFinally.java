package material.excecao;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dividendo, divisor = 1;
        do {
            try {
                System.out.println("Digite o valor do dividendo:  ");
                dividendo = s.nextInt();
                System.out.println("Digite o valor do divisor:  ");
                divisor = s.nextInt();

                if (divisor == 0) {
                    throw new Exception(("Não é possível fazer uma divisão por zero"));
                }

                 System.out.println(dividendo + " / " + divisor + " = " + (dividendo / divisor));

            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            } finally {
                System.out.println("Bloco Finally. ");
            }
        } while( divisor == 0);

    }
}

