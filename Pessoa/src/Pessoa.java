public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // construtor
    public Pessoa(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
        super();
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
   
    public String getCpf() {
        return cpf;
    }
  
    public String getEndereco() {
        return endereco;
    }

}
