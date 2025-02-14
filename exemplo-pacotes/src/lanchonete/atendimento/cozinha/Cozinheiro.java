package atendimento.cozinha;

import atendimento.Atendente;

public class Cozinheiro {
    
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    
    public void adicionarComboNoBalcao() {
        System.out.println("ADICIONANDO COMBO NO BALCÃO");        
    }
    
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL NO BALCÃO");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES...");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE DO LANCHE...");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR...");
    }

    private void selecionarIngradientesVitamina() {
        System.out.println("SELECIONANDO INGREDIENTES...");
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE...");
    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA...");    
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

}
