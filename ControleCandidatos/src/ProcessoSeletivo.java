import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private static double salarioBase = 0;
    private static String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer continuar = 1;
        salarioBase = 2000;
    
        System.out.println("Processo Seletivo");
        // selecionaCincoCandidatos();
        // imprimirSelecionados();
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
            /*
            while (continuar == 1) {
                System.out.print("Qual sua pretensão salarial? ");
                double salarioPretendido = sc.nextDouble();
                analisarCandidato(salarioPretendido);
    
                System.out.print("Deseja lançar outra candidatura? [1] para Sim   [2] Não: ");
                continuar = sc.nextInt();
            }
                */
        }
        
        static void analisarCandidato(double salarioPretendido) {
    
            if (salarioPretendido > salarioBase) {
            System.out.println("LIGAR PARA O(A) CANDIDATO(A)");
        }
        else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O(A) CANDIDATO(A) COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO RESULTADO DO(A)S DEMAIS CANDIDATOS(A)");
        }
    }

    static void selecionaCincoCandidatos() {
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário de: " + salarioPretendido);

            if (salarioPretendido >= salarioBase) {
                candidatosSelecionados++;
                System.out.println("O candidato(a) " + candidato + " foi selecionado(a) para a vaga ocupando a vaga " + candidatosSelecionados + "/5!");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900, 2200);
    }

    static void imprimirSelecionados() {
        System.out.println("Lista de candidatos com índice:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O(a) candidato(a) de índice " + (indice + 1) + " é o(a) " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de iteração for each:");

        for (String candidato: candidatos) {
            System.out.println("O(a) candidato(a) selecionado(a) foi " + candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativas++;
            }
            else {
                System.out.println("Contato realizado com sucesso.");
            }
        } while(continuarTentando && tentativas < 3);

        if (atendeu) {
            System.out.println("Contato realizado com sucesso com " + candidato + " na " + tentativas + "ª tentativa.");
        }
        else {
            System.out.println("Não foi possível contato com " + candidato + " após " + tentativas + " tentativas...");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
