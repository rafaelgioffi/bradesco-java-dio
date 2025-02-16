public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa marcos = new Pessoa("123.456.789-10", "MARCOS");
        //marcos.setEndereco("RUA DAS MARIAS");

        Pessoa maria = new Pessoa("123.456.789-11", "MARIA");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
        System.out.println(maria.getNome() + " - " + maria.getCpf());
    }
}
