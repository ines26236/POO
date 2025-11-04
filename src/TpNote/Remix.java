package TpNote;

public class Remix extends Titre{

	

	private Titre original;   

    private Artiste remixeur; 

    
    public Remix(String nom, int duree, int tempo,  Artiste remixeur, Titre original, int artiste) {

        super(nom, duree,tempo, artiste);

        this.original = original;

        this.remixeur = remixeur;

    }



    public Titre getOriginal() {

        return original;

    }



    public Artiste getRemixeur() {

        return remixeur;

    }

    

    public String toString() {

        return nom + " - " + remixeur.getNom() + " (Remix de " + original.getNom() + ")";

    }



}
