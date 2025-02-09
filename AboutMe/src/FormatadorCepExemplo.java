public class FormatadorCepExemplo {

public static void main(String[] args) {
    try {
        String cepFormatado = formatarCep("20010200");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException cp) {
        cp.printStackTrace();
    }
}

static String formatarCep (String cep) throws CepInvalidoException {
    if(cep.length() != 8) {
        throw new CepInvalidoException();
    }
    else {
        cep = cep.substring(0,5) + "-" + cep.substring(5,8);
    }

    return cep;
}

}