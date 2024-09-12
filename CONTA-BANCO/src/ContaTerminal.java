import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta.");
        int Conta = scanner.nextInt();

        System.out.println("Digite a Agencia da Conta.");
        String Agencia = scanner.next();

        System.out.println("Nome do Cliente.");
        String Nome = scanner.next();

        System.out.println("Digite seu Saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + Nome + ", Obrigado por criar uma conta em nosso banco, sua agência é "
         + Agencia + ", conta " + Conta + ", e seu saldo " + saldo + " já está diisponivel para saque" );
    }
}
