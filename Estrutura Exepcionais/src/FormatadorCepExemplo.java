public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("123456087");
        } catch (CepinvalidoException e) {
            System.out.println("O cep não corresponde a regra de negocio");
            throw new RuntimeException(e);
        }
    }
    static String formatarCep(String cep) throws CepinvalidoException {
        if (cep.length() != 8) {
            throw new CepinvalidoException();
        }
        System.out.println("O cep corresponde a regra de negocio");
        return cep;
    }
}
