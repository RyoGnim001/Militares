public class MilitarAeronautica extends Militar {
    private int anosNaPatente;
    private double horasDeVoo;

    public MilitarAeronautica(int matricula, String patente, int anosNaPatente, double horasDeVoo) {
        super(matricula, patente);
        this.anosNaPatente = anosNaPatente;
        this.horasDeVoo = horasDeVoo;
    }

    public int getAnosNaPatente() {
        return anosNaPatente;
    }

    public double getHorasDeVoo() {
        return horasDeVoo;
    }

    @Override
    public boolean podeProgredir() {
        return (anosNaPatente > 2 && horasDeVoo > 100);
    }

    @Override
    public String toString() {
        return "MilitarAeronautica [matricula=" + matricula + ", patente=" + patente + "]";
    }
}
