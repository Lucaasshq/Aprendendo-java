package EstrutaCondicional;

public class SistemaMedidas {
    public static void main(String[] args) {
        String sigla = "M";
        // Estrutura condicional simples
        if (sigla == "P"){
            System.out.println("PEQUENO");
        } else if (sigla == "M") {
            System.out.println("MÈDIO");
        } else if (sigla == "G") {
            System.out.println("GRADE");
        } else {
            System.out.println("INDEFINIDO");
        }

        // Estrutura Switch

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÈDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
