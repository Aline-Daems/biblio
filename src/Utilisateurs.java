public class Utilisateurs {

    String nom;
    String prenom;
    String login;
    String password;
    String role;
    Boolean admin;

    public Utilisateurs(String nom, String prenom, String login, String password, String role, Boolean admin) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.role = role;
        this.admin = admin;
    }
}
