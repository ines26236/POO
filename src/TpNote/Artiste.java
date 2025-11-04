package TpNote;

import java.util.ArrayList;
import java.util.List;

public class Artiste extends Utilisateur {
	private double revenus;
    private List<Titre> titres;

    public Artiste(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
        this.revenus = 0;
        this.titres = new ArrayList<>();
    }

    public void ajouterTitre(Titre t) {
        titres.add(t);
        System.out.println("Titre ajouté : " + t.getNom() + " par " + nom);
    }

    public void recevoirPaiement(double montant) {
        revenus += montant;
    }

    public double getRevenus() { return revenus; }
}

