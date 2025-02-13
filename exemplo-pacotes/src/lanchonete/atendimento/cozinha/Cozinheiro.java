package atendimento.cozinha;

import atendimento.Atendente;

public class Cozinheiro {

void adicionarLancheNoBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAL NO BALCÃO");
}

public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
}

public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
}

}
