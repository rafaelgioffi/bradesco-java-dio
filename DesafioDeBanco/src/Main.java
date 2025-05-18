import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        Conta cp = null;
        Conta cc = null;
        String tipoConta = null;

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("======================");
            System.out.println("Bem vindo ao Bradesco!");
            System.out.println("======================");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta Corrente");
            System.out.println("3 - Cadastrar Conta Poupança");
            System.out.println("4 - Escolher Conta");
            System.out.println("5 - Extrato");
            System.out.println("6 - Depositar");
            System.out.println("7 - Sacar");
            System.out.println("8 - Transferir");
            System.out.println("0 - Sair");
            System.out.println("======================");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            System.out.println("======================");

            switch (opcao) {
                case 1: {
                    System.out.print("Qual nome do cliente? ");
                    String cliname = sc.next();
                    cliente = new Cliente();
                    cliente.setNome(cliname);
                    System.out.println(cliname + " cadastrado(a) com sucesso!");
                    break;
                }
                case 2: {
                    if (cliente == null) {
                        System.out.println("Nenhum cliente cadastrado ainda. Favor cadastrar primeiro na opção 1");
                        break;
                    }

                    cc = new ContaCorrente(cliente);
                    cc.criarConta();
                    tipoConta = "cc";
                    break;
                }
                case 3: {
                    if (cliente == null) {
                        System.out.println("Nenhum cliente cadastrado ainda. Favor cadastrar primeiro na opção 1");
                        break;
                    }

                    cp = new ContaPoupanca(cliente);
                    cp.criarConta();
                    tipoConta = "cp";
                    break;
                }

                case 4: {
                    while (tipoConta == null) {
                        System.out.println("Qual conta deseja utilizar?");
                        System.out.println("'cc' => Conta Corrente\n'cp' => Conta Poupança");
                        System.out.print("Escolha: ");
                        tipoConta = sc.next().toLowerCase();
                    }
                    String trocarConta = null;
                    if (tipoConta.equals("cc")) {
                        System.out.print("Conta Corrente selecionada. Deseja trocar?\n's' para Sim\n'n' para Não: ");
                        trocarConta = sc.next().toLowerCase();

                        if (trocarConta.equals("s")) {
                            tipoConta = "cp";
                        }
                        break;
                    }
                    else if (tipoConta.equals("cp")) {
                        System.out.print("Conta Poupança selecionada. Deseja trocar?\n's' para Sim\n'n' para Não: ");
                        trocarConta = sc.next().toLowerCase();

                        if (trocarConta.equals("s")) {
                            tipoConta = "cc";
                        }
                    }
                    break;
                }

                case 5: {
                    if (tipoConta == "cc") {
                        cc.imprimirExtrato();
                    } else if (tipoConta == "cp") {
                        cp.imprimirExtrato();
                    }
                    else {
                        System.out.println("Favor selecione um tipo de conta primeiro! Opção 4");
                    }
                    break;
                }

                case 6: {
                    double valor = 0;

                    if (tipoConta != null) {
                        System.out.print("Qual o valor a ser depositado? R$");
                        valor = sc.nextDouble();
                    }

                    if (tipoConta == "cc") {
                    cc.depositar(valor);
                    } else if (tipoConta == "cp") {
                    cp.depositar(valor);
                    }
                    else {
                        System.out.println("Favor selecione um tipo de conta primeiro! Opção 4");
                    }
                    break;
                }

                case 7: {
                    double valor = 0;

                    if (tipoConta != null) {
                    System.out.print("Qual o valor a ser sacado? R$");
                    valor = sc.nextDouble();
                    }

                    if (tipoConta == "cc") {
                        cc.sacar(valor);
                    } else if (tipoConta == "cp") {
                        cp.sacar(valor);
                    }
                    else {
                        System.out.println("Favor selecione um tipo de conta primeiro! Opção 4");
                    }
                    break;
                }

                case 8: {
                    double valor = 0;
                    if (tipoConta != null) {

                    System.out.print("Qual o valor a ser transferido? R$");
                     valor = sc.nextDouble();
                    }

                    if (tipoConta == "cc") {
                        cc.transferir(valor, cp);
                    } else if (tipoConta == "cp") {
                        cp.transferir(valor, cc);
                    }
                    else {
                        System.out.println("Favor selecione um tipo de conta primeiro! Opção 4");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }
        }

        System.out.println("============================================");
        System.out.println("Obrigado por utilizar o banco! Volte sempre!");
        System.out.println("============================================");

    }
}