public class Moto extends Veiculo {
    public  void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("MOTO LIGADA!");
    }

    private void confereCambio(){
        System.out.println("CONFERINDO CÂMBIO...");
    }

    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL...");
    }
}
