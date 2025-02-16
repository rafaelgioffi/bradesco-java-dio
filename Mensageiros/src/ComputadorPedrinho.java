import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        /* PARTE 1
        System.out.println("** MSN:");
        apps.MSNMessenger msnMessenger = new apps.MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        System.out.println("** FACEBOOK:");
        apps.FacebookMessenger facebookMessenger = new apps.FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();

        System.out.println("** TELEGRAM:");
        apps.Telegram telegram = new apps.Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
         */

        /* PARTE 2 */
        Scanner sc = new Scanner(System.in);
        ServicoMensagemInstantanea smi = null;
        //NÃO SE SABE QUAL APP O USUÁRIO VAI ESCOLHER...
        String appEscolhido;
        System.out.println("Qual app de mensagem? ");
        System.out.println("1 - MSN Messenger");
        System.out.println("2 - Facebook Messenger");
        System.out.println("3 - apps.Telegram");
        System.out.print("==> ");
        appEscolhido = sc.next();

        if(appEscolhido.equals("1"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("2"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("3"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
