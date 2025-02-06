public class MinhaClasse 
{
    public static void main(String[] args) 
    {
        String meuNome = "Rafael";
        int anoFabricacao = 2022;
        boolean verdadeira = true;

        anoFabricacao = 2018;

        String segundoNome = "Gioffi";

        String nomeCompleto = nomeCompleto(meuNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
