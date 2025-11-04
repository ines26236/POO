package TpNote;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	 private String nom;
	    private Ecouteur createur;
	    private boolean publique;
	    private List<Titre> titres;

	    public Playlist(String nom, Ecouteur createur) {
	        this.nom = nom;
	        this.createur = createur;
	        this.titres = new ArrayList<>();
	        this.publique = false;
	    }

	    public void ajouterTitre(Titre t) {
	        titres.add(t);
	        System.out.println("Titre ajouté à la playlist : " + t.getNom());
	    }

	    public List<Titre> getTitres() { return titres; }
	}

