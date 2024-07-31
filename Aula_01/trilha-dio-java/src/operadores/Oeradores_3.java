package operadores;

public class Oeradores_3 {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao = false;

        if (condicao && condicao1) {
            System.out.println("As duas condicoes são verdadeiras");
        }


        if (condicao || condicao1) {
            System.out.println("A condição 1 ou a condição 2 verdadeira");
        }

        System.out.println("FIM");
    }
}
