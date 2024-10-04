import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada 1: Nome do serviço a ser verificado
        String servicoVerificado = scanner.nextLine();

        // Entrada 2: Nome do cliente e serviços contratados
        String[] dadosCliente = scanner.nextLine().split(",");

        String nomeCliente = dadosCliente[0]; // Nome do cliente
        boolean contratouServico = false;

        // Verificar se o cliente contratou o serviço
        for (int i = 1; i < dadosCliente.length; i++) {
            if (dadosCliente[i].equalsIgnoreCase(servicoVerificado)) {
                contratouServico = true;
                break;
            }
        }

        // Saída: Sim ou Não
        if (contratouServico) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
