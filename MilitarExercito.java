public class MilitarExercito extends Militar {
    private boolean participouGuerra;
    private boolean paisVenceu;

    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean paisVenceu) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.paisVenceu = paisVenceu;
    }

    public boolean isParticipouGuerra() {
        return participouGuerra;
    }

    public boolean isPaisVenceu() {
        return paisVenceu;
    }

    @Override
    public boolean podeProgredir() {
        return (participouGuerra && paisVenceu);
    }

    @Override
    public String toString() {
        return "MilitarExercito [matricula=" + matricula + ", patente=" + patente + "]";
    }
}
