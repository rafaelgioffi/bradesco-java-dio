public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("** MSN:");
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        System.out.println("** FACEBOOK:");
        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();

        System.out.println("** TELEGRAM:");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
