package exercicio1;

public record Email(String para, String assunto, String corpo) implements Messages {

    @Override
    public String sendMessage() {
        var email = "Destinatário(s): " + para + "\nAssunto: " + assunto + "\nMensagem: " + corpo;
        return email;
    }
}
