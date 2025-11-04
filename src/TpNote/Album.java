package TpNote;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nom;
    private String visuel;
    private Artiste artistePrincipal;
    private boolean compilation;
    private List<Titre> titres;

    public Album(String nom, String visuel, Artiste artistePrincipal, boolean compilation) {
        this.nom = nom;
        this.visuel = visuel;
        this.artistePrincipal = artistePrincipal;
        this.compilation = compilation;
        this.titres = new ArrayList<>();
    }

    public void ajouterTitre(Titre t) {
        titres.add(t);
        t.setAlbum(this);
    }

    public List<Titre> getTitres() {
        return titres;
    }

    public String getNom() {
        return nom;
    }

    public String getVisuel() {
        return visuel;
    }

    public boolean isCompilation() {
        return compilation;
    }

    public Artiste getArtistePrincipal() {
        return artistePrincipal;
    }

    @Override
    public String toString() {
        return "Album : " + nom + " (" + titres.size() + " titres)" +
               (compilation ? " [Compilation]" : " | Artiste : " + 
               (artistePrincipal != null ? artistePrincipal.getNom() : "Inconnu"));
    }
}
