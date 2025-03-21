public class MilitarMarinha extends Militar {
    private boolean participouConserto;

    public MilitarMarinha(int matricula, String patente, boolean participouConserto) {
        super(matricula, patente);
        this.participouConserto = participouConserto;
    }

    public boolean isParticipouConserto() {
        return participouConserto;
    }

    @Override
    public boolean podeProgredir() {
        return participouConserto;
    }

    @Override
    public String toString() {
        return "MilitarMarinha [matricula=" + matricula + ", patente=" + patente + "]";
    }
}
