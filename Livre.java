public class Livre {
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    // Constante pour indiquer que le prix n'a pas encore été donné
    public static final double PRIX_NON_DONNE = -1.0;

    // Constructeur prenant en paramètre le titre, l'auteur et le nombre de pages
    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = PRIX_NON_DONNE; // Par défaut, le prix n'a pas encore été donné
        this.prixFixe = false; // Le prix peut être modifié initialement
    }

    // Constructeur prenant en paramètre le titre, l'auteur, le nombre de pages et le prix
    public Livre(String titre, String auteur, int nbPages, double prix) {
        this(titre, auteur, nbPages);
        this.prix = prix;
        this.prixFixe = true; // Le prix est fixé
    }

    // Méthodes d'accès (getters) pour les attributs
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    // Méthodes d'altération (setters) pour les attributs
    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.out.println("Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }

    // Méthode pour vérifier si le prix a été fixé
    public boolean prixFixe() {
        return prixFixe;
    }

    // Méthode toString pour afficher les informations du livre
    public String toString() {
        if (prix == PRIX_NON_DONNE) {
            return "Titre : " + this.titre + ", Auteur : " + this.auteur +
            		", Nombre de pages : " + this.nbPages + 
            		", Prix : Prix pas encore donné";
        } else {
            return "Titre : " + this.titre + ", Auteur : " + this.auteur +
            		", Nombre de pages : " + this.nbPages + ", Prix : " + this.prix;
        }
    }

    // Méthode pour comparer deux livres sur leur nombre de pages
    public int compare(Livre autreLivre) {
        if (this.nbPages == autreLivre.nbPages) {
            return 0;
        } else if (this.nbPages > autreLivre.nbPages) {
            return 1;
        } else {
            return -1;
        }
    }
}

