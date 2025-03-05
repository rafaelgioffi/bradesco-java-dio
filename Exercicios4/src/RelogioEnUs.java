public non-sealed class RelogioEnUs extends Relogio {

    private String ampm;

    public String getAmpm() {
        return ampm;
    }

    public void setPreMeiodia() {
        this.ampm = "AM";
    }

    public void setPosMeiodia() {
        this.ampm = "PM";
    }

    public void setHora(int hora) {
        setPreMeiodia();
        if ((hora > 12) && (hora <= 23)) {
            setPosMeiodia();
            this.hora = hora - 12;
        }
        else if (hora >= 24) {
            this.hora = 0;
        }
        else {
            this.hora = hora;
        }
    }

    @Override
    public Relogio converter(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioEnUs enUs -> {
                this.hora = enUs.getHora();
                this.ampm = enUs.getAmpm();
            }
            case RelogioPtBr ptBr -> this.setHora(ptBr.getHora());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.ampm;
    }
}
