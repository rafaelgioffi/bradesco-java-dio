import java.util.Scanner;

public class Music {
    private static Scanner sc = new Scanner(System.in);
    private static String music;

    public static String iPod_playMusic() {
        if (music == null) {
            System.out.println("\nSelecione uma música antes...");
            iPod_select();
            return "\nTocando a música '" + music + "'...\n";
        }
        else {
            return "\nTocando a música '" + music + "'...\n";
        }
    }

    public static String iPod_pauseMusic() {
        if (music == null) {
            System.out.println("Selecione uma música antes...");
            iPod_select();
            return " ";
        }
        else {
            return "\nMúsica '" + music + "' pausada...\n";
        }
    }

    public static String iPod_select() {
        System.out.print("Qual música você quer ouvir? ");
//        sc.nextLine();
        var musicName = sc.nextLine();
        music = musicName;

        return "\nMúsica '" + music + "' selecionada!\n";
    }
}
