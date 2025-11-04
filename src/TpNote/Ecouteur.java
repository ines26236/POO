package TpNote;

import java.util.ArrayList;
import java.util.List;

public class Ecouteur extends Utilisateur {
    private double solde;
    private boolean hd;
    private List<Playlist> playlists;

    public Ecouteur(String nom, String email, String motDePasse, boolean hd) {
        super(nom, email, motDePasse);
        this.hd = hd;
        this.playlists = new ArrayList<>();
        this.solde = 0;
    }

    public double ecouterTitre(Titre t) {
        double cout = (hd ? 0.03 : 0.02) * (t.getDuree() / 5.0);
        solde += cout;
        t.getArtiste().recevoirPaiement(cout * 0.66);
        System.out.printf("%s écoute '%s' (%.2f € facturé)%n", getNom(), t.getNom(), cout);
        return cout;
    }

    public double ecouterTitre(Cover cover) {
        return ecouterTitre((Titre) cover);
    }

    public double ecouterTitre(Remix remix) {
        return ecouterTitre((Titre) remix);
    }

    public void creerPlaylist(String nom) {
        playlists.add(new Playlist(nom, this));
        System.out.println("Playlist créée : " + nom);
    }

    public double getSolde() {
        return solde;
    }
}
