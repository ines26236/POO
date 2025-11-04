package TpNote;

public class Remix extends Titre {
    private Titre original;
    private Artiste remixeur;

    public Remix(String nom, double duree, String style, int tempo, Artiste remixeur, Titre original) {
        super(nom, duree, style, tempo, remixeur);
        this.original = original;
        this.remixeur = remixeur;
    }

    public Titre getOriginal() {
        return original;
    }

    public Artiste getRemixeur() {
        return remixeur;
    }

    @Override
    public String toString() {
        return nom + " - " + remixeur.getNom() + " (Remix de " + original.getNom() + ")";
    }
}
