import keyword.*;
import java.util.Scanner;

public class Main_keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var user = new Client();
        user.setName("Rafael");
        System.out.println(user.getName());

        var client = new Client();
        client.setName("name");
        client.setStaticName("staticName");
        System.out.println(client.getName());
        System.out.println(client.getStaticName());

        var client2 = new Client();
        System.out.println(client2.getStaticName());
    }
}
