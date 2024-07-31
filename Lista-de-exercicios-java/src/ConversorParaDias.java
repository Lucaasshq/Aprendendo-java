import java.util.Scanner;

public class ConversorParaDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita o valor em anos");
        int nome = scanner.nextInt();

        System.out.println("Digite o valor em meses");
        int meses = scanner.nextInt();

        System.out.println("Digita o valor em dias");
        int dias = scanner.nextInt();
        int totalDeDias = calcularIdadeEmdias(nome, meses, dias);
        System.out.println("O seu total de dias de vida é:" + totalDeDias);

        scanner.close();

    }

    public static int calcularIdadeEmdias(int anos, int meses, int dias) {
        int totalDias = (anos * 365) + (meses * 30);
        return totalDias;
    }

}
