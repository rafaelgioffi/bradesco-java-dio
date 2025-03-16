import java.util.Scanner;

public class iPhone {
        private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        while (option >= 0) {
            System.out.println("Menu Inicial ==> iPhone");
            System.out.println(" ");
            System.out.println(" iPod");
            System.out.println("   11 - Reproduzir Música");
            System.out.println("   12 - Pausar Música");
            System.out.println("   13 - Selecionar Música");
            System.out.println("\n Telefone");
            System.out.println("   21 - Realizar Ligação");
            System.out.println("   22 - Atender Ligação");
            System.out.println("   23 - Iniciar Correio de Voz");
            System.out.println("\n Safari Web Browser");
            System.out.println("   31 - Abrir Website");
            System.out.println("   32 - Nova Aba");
            System.out.println("   32 - Nova Aba");
            System.out.print("Escolha a opção => ");
            option = sc.nextInt();

            switch (option) {
                case 11 -> {
                    System.out.println(MusicPlayer.iPod_playMusic());
                }
                case 12 -> {
                    System.out.println(MusicPlayer.iPod_pauseMusic());
                }
                case 13 -> {
                    System.out.println(MusicPlayer.iPod_select());
                }
                case 21 -> {
                    System.out.println(Phone.Call());
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }
    }

}
