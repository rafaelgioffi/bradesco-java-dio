package dio.springboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${name:NoReply-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList());

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
        + "\nE-mail: " + email
        + "\ncom os telefones: " + telefones);

        System.out.println("Seu cadastro foi aprovado!");
    }
}

