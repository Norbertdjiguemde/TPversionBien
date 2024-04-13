public class Personns {
    // Champs de la classe Personne
    private String CIN;
    private String Nom;
    private String Prenom;
    private String Email;
    private int Age;
    
    // Constructeur pour initialiser les valeurs des champs
    public Personns(String CIN, String Nom, String Prenom, String Email, int Age) {
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Age = Age;
    }
    
    // Méthode pour afficher les informations de la personne
    public void afficherPersonns() {
        System.out.println("CIN: " + CIN);
        System.out.println("Nom: " + Nom);
        System.out.println("Prénom: " + Prenom);
        System.out.println("Email: " + Email);
        System.out.println("Age: " + Age);
    }
    
    // Fonction main pour tester l'implémentation
    public static void main(String[] args) {
        // Création d'une instance de la classe Personne
        Personns p1 = new Personns("B2004", "KI", "Jean", "jean.ki@example.com", 30);
        Personns p2 = new Personns("123456", "DA", "Ali", "ali.da@example.com", 50);
        Personns p3 = new Personns("CB4561", "DA", "félix", "felix.da@example.com", 10);
       
        // Appel à la méthode pour afficher les informations de la personne
        p1.afficherPersonns();
        p2.afficherPersonns();
        p3.afficherPersonns();
    }
}
