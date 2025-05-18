public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da conta poupança ===");
        super.imprimirInfosComuns();
    }

    public void criarConta() {
        System.out.println("Obrigado por abrir uma conta poupança conosco!");
        super.criarContaInfo();
    }
}
