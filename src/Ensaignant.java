import java.util.ArrayList;
public class Ensaignant extends Module {
    private static int nextMatricule = 10000;
    private int matricule;
    private String nom;
    private String prenom;
    private int echell;
    private ArrayList<String> listeModule;

    public Ensaignant(String nom, String prenom, int echell, ArrayList<String> listeModule) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.echell = echell;
        this.listeModule = listeModule;
        this.matricule = nextMatricule++;
    }

    public void ajouterModule(String module) {
        if (!listeModule.contains(module)) {
            listeModule.add(module);
        }
    }
    public int calculerMasseHoraire() {
        int  Horaire  = 0;
        for (String module : listeModule) {
            Horaire += Module.getHoraire(module);
        }
        return Horaire;
    }
}

