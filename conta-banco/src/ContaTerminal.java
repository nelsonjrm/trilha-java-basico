import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe scanner

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exebir as mensagens para o nosso usuário

        System.out.println("Por fajvor cliente, digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Agora digite sua Agência");
        String suaAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();

        double saldoCliente = 237.48;

        //Obter pela classe scanner os valores digitados no Terminal

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente);
        System.out.println("Obrigado por criar sua conta no nosso banco, sua agência é " + suaAgencia);
        System.out.println("conta " + numeroConta);
        System.out.println(" e seu saldo de R$ " + saldoCliente + " já está disponível para saque.");
    }
}