package techstore;

public class Article {

    private int id;
    private String nom;
    private String reference;
    private double prix;

    private static int c = 0;


    public Article(String nom, double prix) {
        c++;
        this.id = c;
        this.nom = nom;
        this.prix = prix;
        this.reference = genererReference();
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }


    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setNom(String nom) {
        this.nom = nom;
        this.reference = genererReference();
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    private String genererReference() {

        String reference = "";


        for (int i = 0; i < nom.length(); i++) {
            if (i % 5 == 0) {
            	if(nom.charAt(i)!=' ') {
                 reference = reference + nom.charAt(i);
            	}
            }
        }

        reference = reference + id;

        return reference;
    }

    public void modifier(String nom) {
        this.nom = nom;
        this.reference = genererReference();
    }

    public void modifier(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
        this.reference = genererReference();
    }

    public String toString() {
        return "id=" + id
                + ", nom=" + nom
                + ", reference=" + reference
                + ", prix=" + prix;
    }
}