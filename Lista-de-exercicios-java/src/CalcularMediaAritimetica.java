import java.util.Scanner;

public class CalcularMediaAritimetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Calcular Media aritimética===");
        System.out.println("digite o número de elementos");
         int n = scanner.nextInt();
         double soma = 0;

        if (n <= 0) {
            System.out.println("O númuero deve ser positivo");
        }

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o elemento" + i + ":");
            double elementos = scanner.nextInt();
            soma += elementos;
        }

        double media = soma / n;
        System.out.println("A média aritimética é:" + media);



    }
}
