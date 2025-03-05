public non-sealed class RelogioPtBr extends Relogio{

    @Override
    public Relogio converter(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioEnUs enUs -> this.hora = (enUs.getAmpm().equals("PM")) ? enUs.getHora() + 12 : enUs.getHora();
            case RelogioPtBr ptBr -> this.hora = ptBr.getHora();
        }
        return this;
    }
}
