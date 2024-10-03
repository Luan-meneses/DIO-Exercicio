import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Capturando primeiro parametro
            System.out.println("Digite o primeiro parametro");
            int parametroUm = scanner.nextInt();
        
            //Capturando segundo paramentro
            System.out.println("Digite o segundo parametro");
            int parametroDois = scanner.nextInt();

            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parametro precisa ser maior que o primeiro");
            }

            int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i++) {
                System.out.println("imprimindo o numero " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}