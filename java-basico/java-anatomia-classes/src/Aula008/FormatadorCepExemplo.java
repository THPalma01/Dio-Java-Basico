package Aula008;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcepition e) {
            System.out.println("O CEP não corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExcepition{
        if(cep.length() != 8);
        throw new CepInvalidoExcepition();
    }
}
