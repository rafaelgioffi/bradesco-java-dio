package atendimento;

public class Atendente {

private void pegarLancheCozinha() {
    System.out.println("PEGANDO LANCHE NA COZINHA...");
}

public void receberPagamento() {
    System.out.println("RECEBENDO PAGAMENTO...");
}

public void servindoMesa() {
    pegarLancheCozinha();
    System.out.println("SERVINDO A MESA...");
}

void trocarGas() {
    System.out.println("ATENDENTE TROCANDO O GÁS...");
}

private void pegarPedidoBalcao() {
    System.out.println("PEGANDO O PEDIDO NO BALCAO...");
}

}
