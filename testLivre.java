
// Classe de test
public class testLivre {
    public static void main(String[] args) {
        // Création de quelques livres
        Livre livre1 = new Livre("Titre1", "Auteur1", 200);
        Livre livre2 = new Livre("Titre2", "Auteur2", 300, 100);
        Livre livre3 = new Livre("Titre3", "Auteur3", 150);
        Livre livre4 = new Livre("Titre4", "Auteur4", 100,50);
 
        // Affichage des informations des livres
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
        System.out.println(livre4);

        // Comparaison des livres sur leur nombre de pages
        System.out.println("Comparaison de livre1 avec livre2 : " + livre1.compare(livre2));
        System.out.println("Comparaison de livre2 avec livre3 : " + livre2.compare(livre3));
        System.out.println("Comparaison de livre3 avec livre4 : " + livre3.compare(livre4));
        System.out.println("Comparaison de livre4 avec livre1 : " + livre4.compare(livre1));
        // Création d'une étagère
        Etagère etagere = new Etagère(4);

        // Ajout des livres à l'étagère
        etagere.ajouter(livre1);
        etagere.ajouter(livre2);
        etagere.ajouter(livre3);
        etagere.ajouter(livre4);

        // Récupération et affichage d'un livre à une position donnée
        Livre livreRecupere = etagere.getLivre(2);
        System.out.println("Livre récupéré à la position 2 : " + livreRecupere);
        Livre livreRecuper = etagere.getLivre(4);
        System.out.println("Livre récupéré à la position 4 : " + livreRecuper);

        // Recherche d'un livre par son titre et auteur
        int positionLivre = etagere.chercherLivre("Titre2", "Auteur2");
        if (positionLivre != 0) {
        System.out.println("Le premier livre recherché est trouvé à la position : " + positionLivre);
        } else { System.out.println("Le livre n'est pas trouvé sur l'étagère.");}
        
        int positionLivr = etagere.chercherLivre("Titre4", "Auteur4");
        if (positionLivr != 0) {
        System.out.println("Le deuxième livre recherhcé est trouvé à la position : " + positionLivr);
        } else {System.out.println("Le livre n'est pas trouvé sur l'étagère."); }
        
        int positionLivres = etagere.chercherLivre("Titre5", "Auteur5");
        if (positionLivres != 0) {
        System.out.println("Le troisième livre recherhcé est trouvé à la position : " + positionLivres);
        } else { System.out.println("Le troisième livre recherché n'est pas trouvé sur l'étagère."); }
        
        // Suppression d'un livre de l'étagère
        etagere.supprimer(2);
    }
}