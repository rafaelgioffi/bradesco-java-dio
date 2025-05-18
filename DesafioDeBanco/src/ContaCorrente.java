public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da conta corrente ===");
        super.imprimirInfosComuns();
    }


    public void criarConta() {
        System.out.println("Obrigado por abrir uma conta corrente conosco!");
        super.criarContaInfo();
    }
}