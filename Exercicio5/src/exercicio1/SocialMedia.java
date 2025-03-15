package exercicio1;

public record SocialMedia(String para, String mensagem) implements Messages {
    @Override
    public String sendMessage() {
        return "Mensagem para: @" + para + "\nMensagem: " + mensagem;
    }
}
