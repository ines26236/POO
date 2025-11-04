package TpNote;

public class Spotizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artiste daftPunk = new Artiste("Daft Punk", "daft@spotizer.com", "1234");
        Artiste djSnake = new Artiste("DJ Snake", "snake@spotizer.com", "abcd");

        // Création des titres
        Titre original = new Titre("Harder Better Faster Stronger", 3.45, "Electro", 120, daftPunk);
        Remix remix = new Remix("HBFS - DJ Snake Remix", 4.20, "EDM", 128, djSnake, original);
        Cover cover = new Cover("HBFS - Acoustic Cover", 3.30, "Acoustic", 100, new Artiste("Unknown", "", ""), original);

        daftPunk.ajouterTitre(original);
        djSnake.ajouterTitre(remix);

        // Création d’un album
        Album album = new Album("Discovery", daftPunk, "visuel.jpg");
        album.ajouterTitre(original);

        // Création d’un utilisateur écouteur
        Ecouteur user = new Ecouteur("Alice", "alice@spotizer.com", "xyz", true);

        // Écoute de titres
        user.ecouterTitre(original);
        user.ecouterTitre(remix);
        user.ecouterTitre(cover);

        // Création d’une playlist
        user.creerPlaylist("Mes sons favoris");
        Playlist p = new Playlist("Mes sons favoris", user);
        p.ajouterTitre(original);
        p.ajouterTitre(remix);

        // Affichage des soldes et revenus
        System.out.printf("%nSolde utilisateur (%s) : %.2f €%n", user.getNom(), user.getSolde());
        System.out.printf("Revenus artiste (%s) : %.2f €%n", daftPunk.getNom(), daftPunk.getRevenus());
        System.out.printf("Revenus artiste (%s) : %.2f €%n", djSnake.getNom(), djSnake.getRevenus());
    }
	}

