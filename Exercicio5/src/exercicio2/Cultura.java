package exercicio2;

public record Cultura(double valor) implements Tributos {
    @Override
    public String calcularTributos() {
        return "Valor SEM TRIBUTOS: R$" + String.format("%.2f",valor) +
                "\nValor do Tributo (4%): R$" + String.format("%.2f",(valor * 0.04)) +
                "\nValor COM TRIBUTOS: R$" + String.format("%.2f",(valor + (valor * 0.04)));
    }
}
