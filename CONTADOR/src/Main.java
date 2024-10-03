import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();
            
            if (primeiroNumero > segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            
            int quantidadeInteracoes = segundoNumero - primeiroNumero;
            for (int i = 1; i <= quantidadeInteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
