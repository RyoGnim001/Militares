public abstract class Militar implements Carreira {
    protected int matricula;
    protected String patente;

    public Militar(int matricula, String patente) {
        this.matricula = matricula;
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
