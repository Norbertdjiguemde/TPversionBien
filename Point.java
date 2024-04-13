public class Point {
    // Champs de la classe Point
    private char nom;
    private double abscisse;

    // Constructeur pour initialiser les valeurs du point
    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    // Constructeur prenant un objet Point comme argument
    public Point(Point p) {
        this.nom = p.nom;
        this.abscisse = p.abscisse;
    }

    // Méthode pour afficher les caractéristiques du point
    public void affiche() {
        System.out.println("Nom du point = " + nom);
        System.out.println("Abscisse du point = " + abscisse);
    }

    // Méthode pour effectuer une translation du point
    public void translate(double translation) {
        abscisse += translation;
    }

    // Fonction main pour tester l'implémentation
    public static void main(String[] args) {
        // Création d'un point
        Point point1 = new Point('A', 5.0);
        Point point2 = new Point('B', 4.0);
        Point point3 = new Point('C', 7.0);

        // Affichage des caractéristiques du point avant la translation
        System.out.println("Caractéristiques du point avant translation :");
        point1.affiche();
        point2.affiche();
        point3.affiche();

        // Translation du point
        point1.translate(3.0);
        point2.translate(6.0);
        point3.translate(8.0);

        // Affichage des caractéristiques du point après la translation
        System.out.println("\nCaractéristiques du point après translation :");
        point1.affiche();
        point2.affiche();
        point3.affiche();
    }
}
