import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita informações ao usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        // Exibe a mensagem com as informações inseridas pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        sc.close();
    }
}
