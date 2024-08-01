package EstrutaCondicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Voce esta de recuperação");
        } else {
            System.out.println("Reprovado");
        }

        String Resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(Resultado);
    }
}
