import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class LendoDadosDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digita sua Altura");
            double altura = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");
            System.out.println(e);
        }
    }
}