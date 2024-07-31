import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        try
         (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o número da conta");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite agencia");
            int agencia = scanner.nextInt();

            System.out.println("Digite seu nome e sobrenome");
            String nome = scanner.next();

            System.out.println("Digite o saldo que deseja adicionar a conta");
            BigDecimal saldo = scanner.nextBigDecimal();


            System.out.println("====Bem vindo====");
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Agência: " + agencia);
            System.out.println("Nome: " + nome);
            System.out.println("Saldo: " + saldo);
        } catch (InputMismatchException e){

            System.out.println("Erro: Entrada inválida. Por favor, digite os dados corretamente.");
        }
    }
}

