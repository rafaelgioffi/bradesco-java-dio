public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    private boolean logado = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void realizarLogin(Funcionario funcionario) {
        if (funcionario.getEmail() == null || funcionario.getSenha() == null) {
            System.out.println("O(a) " + funcionario.getNome() + " está com o e-mail e/ou senha vazia. Não é possível realizar o login.");
            funcionario.setLogado(false);
            return;
        }

        if (!funcionario.isLogado()) {
            System.out.println(funcionario.getNome() + " não está logado(a). Login não realizado...");
            return;
        }
        funcionario.setLogado(true);
        System.out.println(funcionario.getNome() + " realizou o login com sucesso!.");
        System.out.println();
    }

    public void realizarLogoff(Funcionario funcionario) {
        if (funcionario.isLogado()) {
            funcionario.setLogado(false);
            System.out.println(funcionario.getNome() + " realizou logoff com sucesso!.");
            System.out.println();
        } else {
            System.out.println(funcionario.getNome() + " não está logado(a). Logoff não realizado...");
            return;
        }
    }

    public void exibirDados(Funcionario funcionario) {
        System.out.println("############################################################");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("E-mail: " + funcionario.getEmail());
        System.out.println("Senha: " + funcionario.getSenha());
        System.out.println("É administrador? " + (funcionario.isAdministrador() ? "Sim" : "Não"));
        System.out.println();
    }

    public void alterarDados(Funcionario funcionario) {
        String info;

        System.out.print("Qual NOME do(a) funcionário(a)? Caso não queira alterar, aperte ENTER >> ");
        info = sc.nextLine();
        if (info != null) {
            funcionario.setNome(info);
        }

        System.out.print("Qual E-MAIL do(a) funcionário(a)? Caso não queira alterar, aperte ENTER >> ");
        info = sc.nextLine();
        if (info != null) {
            funcionario.setEmail(info);
        }

        System.out.print("Qual a SENHA do(a) funcionário(a)? Caso não queira alterar, aperte ENTER >> ");
        info = sc.nextLine();
        if (info != null) {
            funcionario.setSenha(info);
        }

        funcionario.setAdministrador(true);
        exibirDados(funcionario);
    }
}

