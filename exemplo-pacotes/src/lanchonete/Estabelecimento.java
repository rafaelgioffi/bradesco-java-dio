import atendimento.cozinha.Almoxarife;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    //ações que não precisam estar visíveis a todos...
    cozinheiro.adicionarLancheNoBalcao();

    Almoxarife almoxarife = new Almoxarife();
    //ações que não precisam estar visíveis para toda a aplicação...
    almoxarife.controlarEntrada();
    //ações que somento o pacote 'cozinha' precisa conhecer...
    almoxarife.entregarIngredientes();
    almoxarife.trocarGas();
}
}
