public class Carro extends Veiculo {

    public  void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO!");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CÂMBIO...");
    }
    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL...");
    }

}
