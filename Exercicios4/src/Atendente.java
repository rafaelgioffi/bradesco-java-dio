public class Atendente extends Funcionario {
    private double valorCaixa;

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public void receberPagamentos(int pagamento) {
        setValorCaixa(valorCaixa += pagamento);
        System.out.println("Adicionado R$" + pagamento + " ao caixa.");
        System.out.println("Saldo atual: R$" + getValorCaixa());
    }

    public double fecharCaixa() {
        return 0;
    }
}
