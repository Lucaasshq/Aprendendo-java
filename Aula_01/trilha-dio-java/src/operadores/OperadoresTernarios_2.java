package operadores;

public class OperadoresTernarios_2 {


    public static void main(String [] args) {

        String nomeUm = "Lucas";
        String nomeDois = "Lucas";


        int a = 5;
        int b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;



        System.out.println("numeroUm é igual a numeroDois " + simNao );


        simNao = numero1 != numero2;


        System.out.println("numeroUm é diferente a numeroDois " + simNao );


        simNao = numero1 > numero2;


        System.out.println("numeroUm é maior a numeroDois " + simNao );
    }
}
