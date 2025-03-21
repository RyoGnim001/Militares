public class Principal {
    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();

        Militar m1 = new MilitarAeronautica(1, "Soldado", 3, 150);
        Militar m2 = new MilitarExercito(2, "Soldado", true, true);
        Militar m3 = new MilitarMarinha(3, "Soldado", true);
        Militar m4 = new MilitarAeronautica(4, "Cabo", 1, 80);
        Militar m5 = new MilitarExercito(5, "Cabo", false, false);          Militar m6 = new MilitarMarinha(6, "Tenente", true);         // Já está no grau máximo


        cadastro.adicionarMilitar(m1);
        cadastro.adicionarMilitar(m2);
        cadastro.adicionarMilitar(m3);
        cadastro.adicionarMilitar(m4);
        cadastro.adicionarMilitar(m5);


        System.out.println("Militares aptos a progredir:");
        for (Militar m : cadastro.getMilitaresQuePodemProgredir()) {
            System.out.println("Matrícula: " + m.getMatricula() + ", Patente: " + m.getPatente());
        }

        cadastro.progredirMilitares();

        System.out.println("\nApós a progressão:");
        for (Militar m : cadastro.getTodosMilitares()) {
            System.out.println("Matrícula: " + m.getMatricula() + ", Patente: " + m.getPatente());
        }
    }
}
