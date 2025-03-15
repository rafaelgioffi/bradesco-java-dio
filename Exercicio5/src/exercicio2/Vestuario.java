package exercicio2;

public record Vestuario(double valor) implements Tributos {
    @Override
    public String calcularTributos() {
        return "Valor SEM TRIBUTOS: R$" + String.format("%.2f",valor) +
                "\nValor do Tributo (2,5%): R$" + String.format("%.2f",(valor * 0.025)) +
                "\nValor COM TRIBUTOS: R$" + String.format("%.2f",(valor + (valor * 0.025)));
    }
}
