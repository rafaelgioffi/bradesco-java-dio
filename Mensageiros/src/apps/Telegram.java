package apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram...");
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo apps.Telegram...");
    }
}