public sealed abstract class Relogio permits RelogioEnUs, RelogioPtBr {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            this.hora = 0;
            return;
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0) {
            this.minuto = 0;
        }
        else if (minuto >= 60) {
            this.minuto = 60;
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo < 0){
            this.segundo = 0;
        }
        else if (segundo >= 60) {
            this.segundo = 60;
        }
        this.segundo = segundo;
    }

    private String setZeros(int valor) {
        return valor < 9 ? "0" + valor : String.valueOf(valor);
    }

    public String getTime() {
        return setZeros(hora) + ":" + setZeros(minuto) + ":" + setZeros(segundo);
    }

    abstract Relogio converter(Relogio relogio);
}
