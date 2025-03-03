public class Vendedor extends Funcionario {
    private int qtdVendas;

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void realizarVenda() {
        qtdVendas++;
        System.out.println("Venda realizada com sucesso!");
    }

    public void consultarVendas() {
        System.out.println("vendas do vendedor(a): " + qtdVendas);
    }


}
