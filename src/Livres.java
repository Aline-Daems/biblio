import java.time.LocalDate;

public class Livres {

    String nom;
    String auteur;
    LocalDate anneePublication;
    Boolean dispo;

    String ISBN;

    public Livres(String nom, String auteur, LocalDate anneePublication, Boolean dispo, String ISBN) {
        this.nom = nom;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.dispo = dispo;
        this.ISBN = ISBN;
    }
}
