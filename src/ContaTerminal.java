import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BankAccount conta = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        conta.numero = numeroConta;
        conta.agencia = agencia;
        conta.nomeCliente = nomeCliente;
        conta.saldo = saldo;

        
        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco.\n" +
                           "Sua agência é " + conta.agencia + ", conta " + conta.numero + "\n" +
                           "e seu saldo " + conta.saldo + " já está disponível para saque.");

        scanner.close();
    }
}
