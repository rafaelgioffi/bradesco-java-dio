package area.cliente;

public class Cliente {

    public void escolherLanche() {
        System.out.println("CLIENTE ESCOLHENDO O LANCHE...");
    }
    
    public void fazerPedido() {
        System.out.println("CLIENTE FAZENDO O PEDIDO...");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("CLIENTE PAGANDO A CONTA...");
    }
        
    private void consultarSaldoAplicativo() {
        System.out.println("SEU SALDO É: R$");                
    }

}
