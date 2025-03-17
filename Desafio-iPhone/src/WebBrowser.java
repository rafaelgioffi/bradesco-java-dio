import java.util.Scanner;

public class WebBrowser {
    private static Scanner sc = new Scanner(System.in);
    private static String website;
    private static boolean validSite = false;

    public static boolean checkWebsite() {
        if (website == null) {

            while (!validSite) {
                System.out.print("Qual Website deseja visitar? ");
                website = sc.next();

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
        if (checkWebsite()) {
                return "\nAbrindo " + website + "...";
        }
        return "\nTente novamente...";
    }


}

