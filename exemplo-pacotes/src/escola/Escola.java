public class Escola {
public static void main(String[] args) {
    Aluno felipe = new Aluno();
    felipe.setNome("Felipe Junior");
    felipe.setIdade(12);
    felipe.setSexo("M");

    if(felipe.getSexo() == "M") {
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
    else if(felipe.getSexo() == "F") {
        System.out.println("A aluna " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
}
}
