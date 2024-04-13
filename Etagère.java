// Classe Etagere
public class Etagère {
    private int capacite;
    private Livre[] livres;
    private int nbLivresActuels;

    // Constructeur prenant en paramètre le nombre de livres que peut contenir l'étagère
    public Etagère(int capacite) {
        this.capacite = capacite;
        this.livres = new Livre[capacite];
        this.nbLivresActuels = 0;
    }

    // Méthode pour donner le nombre de livres que peut contenir l'étagère
    public int getCapacite() {
        return capacite;
    }

    // Méthode pour donner le nombre de livres que contient l'étagère
    public int getNbLivres() {
        return nbLivresActuels;
    }

    // Méthode pour ajouter un livre à l'étagère
    public void ajouter(Livre livre) {
        if (nbLivresActuels < capacite) {
            livres[nbLivresActuels] = livre;
            nbLivresActuels++;
        } else {
            System.out.println("L'étagère est pleine. Impossible d'ajouter un livre.");
        }
    }

    // Méthode pour récupérer un livre à une position donnée sur l'étagère
    public Livre getLivre(int position) {
        if (position >= 1 && position <= nbLivresActuels) {
            return livres[position - 1];
        } else {
            System.out.println("La position spécifiée n'est pas valide.");
            return null;
        }
    }

    // Méthode pour chercher un livre par son titre et son auteur
    public int chercherLivre(String titre, String auteur) {
        for (int i = 0; i < nbLivresActuels; i++) {
            if (livres[i].getTitre().equals(titre) && livres[i].getAuteur().equals(auteur)) {
                return i + 1; // La position du livre commence à partir de 1
            }
        }
        return 0; // Le livre n'est pas trouvé sur l'étagère
    }

    // Méthode pour supprimer un livre de l'étagère
    public void supprimer(int position) {
        if (position >= 1 && position <= nbLivresActuels) {
            for (int i = position - 1; i < nbLivresActuels - 1; i++) {
                livres[i] = livres[i + 1];
            }
            livres[nbLivresActuels - 1] = null;
            nbLivresActuels--;
            System.out.println("Le livre a été supprimé de l'étagère.");
        } else {
            System.out.println("La position spécifiée n'est pas valide.");
        }
    }
}
