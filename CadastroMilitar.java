import java.util.ArrayList;
import java.util.List;

public class CadastroMilitar {
    private List<Militar> militares;

    public CadastroMilitar() {
        militares = new ArrayList<>();
    }

    public void adicionarMilitar(Militar m) {
        militares.add(m);
    }

    public List<Militar> getMilitaresQuePodemProgredir() {
        List<Militar> aptos = new ArrayList<>();
        for (Militar m : militares) {
            if (m.podeProgredir() && !m.getPatente().equalsIgnoreCase("Tenente")) {
                aptos.add(m);
            }
        }
        return aptos;
    }

    public void progredirMilitares() {
        for (Militar m : militares) {
            if (m.podeProgredir() && !m.getPatente().equalsIgnoreCase("Tenente")) {
                if (m.getPatente().equalsIgnoreCase("Soldado")) {
                    m.setPatente("Cabo");
                } else if (m.getPatente().equalsIgnoreCase("Cabo")) {
                    m.setPatente("Tenente");
                }
            }
        }
    }

    public List<Militar> getTodosMilitares() {
        return militares;
    }
}
