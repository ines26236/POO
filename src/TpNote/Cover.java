package TpNote;

public class Cover extends Titre {
    private Titre original;

    public Cover(String nom, double duree, String style, int tempo, Artiste artiste, Titre original) {
        super(nom, duree, style, tempo, artiste);
        this.original = original;
    }

    public Titre getOriginal() {
        return original;
    }

    @Override
    public String toString() {
        return nom + " - " + artiste.getNom() + " (Cover de " + original.getNom() + ")";
    }
}
