public enum TipoIngresso {
    MEIA_ENTRADA (1, "Meia Entrada"),
    INTEIRA (2, "Inteira");

    private int codIngresso;
    private String tipoIngresso;

    private TipoIngresso(int codIngresso, String tipoIngresso) {
        this.codIngresso = codIngresso;
        this.tipoIngresso = tipoIngresso;
    }

    public int getCodIngresso() {
        return codIngresso;
    }

    public void setCodIngresso(int codIngresso) {
        this.codIngresso = codIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}
