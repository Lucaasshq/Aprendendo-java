package operadores;

public class TiposVariaveis {
    public static void main(String[] args) {

        System.out.print("Hello and welcome!");
        byte idade = 123;
        short ano = 2021;
        int cep = 21007033;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
        System.out.println(idade);

    }
}