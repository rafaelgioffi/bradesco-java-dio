package exercicio1;

public record Sms(String numero, String message) implements Messages {

    @Override
    public String sendMessage() {
        if (numero.length() < 11 || numero.length() > 11) {
            System.out.println("O celular deve ter 11 números!");
            return null;

        } else if (numero.length() == 11) {
            var formatedNum = "(" + numero.substring(0, 2) + ") " + numero.substring(2, 7) + "-" + numero.substring(7, 11);
            return "Mensagem: " + message + "\nDestinatário: " + formatedNum;
        }
        else {
            return null;
        }
    }
}
