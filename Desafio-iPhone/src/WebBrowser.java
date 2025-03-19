import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WebBrowser {
    private static Scanner sc = new Scanner(System.in);
    private static String website;
    private static boolean validSite = false;

    public static boolean checkWebsite() {
        if (website == null) {
            openWebsite();
        } else {
            while (!validSite) {
                if (!website.toLowerCase().contains("http://") && !website.toLowerCase().contains("https://")) {
                    System.out.println("Website inválido!\n");
                    validSite = false;
                } else if (!website.toLowerCase().contains(".com") && !website.toLowerCase().contains(".net")) {
                    System.out.println("Website inválido!\n");
                    validSite = false;
                } else {
                    validSite = true;
                }
            }
        }
        return validSite;
    }

    public static String openWebsite() {
        System.out.print("Qual Website deseja visitar? ");
        website = sc.next();

        if (checkWebsite()) {
            return "\nAbrindo " + website + "...";
        }
        else {
            return "\nTente novamente...";
        }
    }

    public static String newTab() {
        website = null;
        return "\nNova aba aberta!\n";
    }

    public static String updateWebsite() {
        String resp = "";
        if (website != null) {
            System.out.print("\nCerteza que deseja atualizar o website " + website + "? 'S' para SIM ou 'N' para NÃO: ");
            String option = sc.next().toLowerCase();

            if (option.equals("s")) {
                resp = "\n" + website + " atualizado!\n";
            } else {
                resp = "\n" + website + " não atualizado...\n";
            }
        }
        else {
            resp = "\nNenhum website carregado para atualizar!\n";
        }
        return resp;
    }

    public static String stopWebsite() {
        String resp = "";
        if (website != null) {
            resp = "\nCarregamento do " + website + " interrompido!";
        }
        else {
            resp = "\nNão há Website carregando para parar!\n";
        }
        return resp;
    }

}

