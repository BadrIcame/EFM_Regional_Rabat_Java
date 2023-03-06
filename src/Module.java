public class Module {
    private Integer code;
    private String intitule ;
    private static Integer Horaire ;

    public Module(Integer code, String intitule, Integer horaire) {
        this.code = code;
        this.intitule = intitule;
        Horaire = horaire;
    }

    public Module(Integer code , String intitule) {
        this.code = code;
        this.intitule = intitule;
    }

    public Module() {

    }

    public static Integer getHoraire(String module) {
        return Horaire;
    }

    public void setHoraire(Integer horaire) {
        Horaire = horaire;
    }

    @Override
    public String toString() {
        return "Module{" + "code=" + code + ", intitule='" + intitule + '\'' + ", Horaire=" + Horaire + "";
    }

}
