public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

//    public void enviarMensagem() {
//        validarConectadoInternet();
//        System.out.println("Enviando mensagem...");
//        salvarHistoricoMensagem();
//    }

//    public void receberMensagem() {
//        validarConectadoInternet();
//        System.out.println("Recebendo mensagem...");
//        salvarHistoricoMensagem();
//    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico das mensagens...");
    }
}
