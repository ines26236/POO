package TpNote;

public class Titre {
    protected String nom;
    protected double duree; // en minutes
    protected String style;
    protected int tempo;
    protected Artiste artiste;
    protected Album album;
    protected boolean enAttente;

    public Titre(String nom, double duree, String style, int tempo, Artiste artiste) {
        this.nom = nom;
        this.duree = duree;
        this.style = style;
        this.tempo = tempo;
        this.artiste = artiste;
        this.enAttente = false;
    }

    public String getNom() {
        return nom;
    }

    public double getDuree() {
        return duree;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void publier() {
        this.enAttente = false;
        System.out.println(nom + " est maintenant publié !");
    }
}
