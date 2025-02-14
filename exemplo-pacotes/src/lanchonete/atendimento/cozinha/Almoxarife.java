package atendimento.cozinha;

public class Almoxarife {

private void controlarEntrada() {
    System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
}

private void controlarSaida() {
    System.out.println("CONTROLANDO A SAÍDA DOS ITENS");
}

//default
void entregarIngredientes() {
    System.out.println("ENTREGANDO INGREDIENTES");
    controlarSaida();
}

//default
void trocarGas() {
    System.out.println("ALMOXARIFE TROCANDO O GÁS");
}

}
