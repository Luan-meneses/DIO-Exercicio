import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: Capturando a lista de serviços contratados pelo cliente
        String entrada = scanner.nextLine();
        
        // Separando os serviços contratados por vírgula
        String[] servicosContratados = entrada.split(",");
        
        // Variáveis para verificar se cada serviço foi contratado
        boolean contratouMovel = false;
        boolean contratouBandaLarga = false;
        boolean contratouTV = false;

        // Percorrendo os serviços contratados e atualizando as variáveis de controle
        for (String servico : servicosContratados) {
            servico = servico.trim();  // Removendo espaços em branco desnecessários
            if (servico.equalsIgnoreCase("movel")) {
                contratouMovel = true;
            } else if (servico.equalsIgnoreCase("banda larga")) {
                contratouBandaLarga = true;
            } else if (servico.equalsIgnoreCase("tv")) {
                contratouTV = true;
            }
        }

        // Verificando se o cliente contratou todos os serviços necessários
        if (contratouMovel && contratouBandaLarga && contratouTV) {
            System.out.println("Combo Completo");
        } else {
            System.out.println("Combo Incompleto");
        }

        scanner.close();
    }
}
