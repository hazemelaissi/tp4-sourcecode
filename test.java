package techstore;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> noms = new ArrayList<String>();
	ArrayList<Double> prix = new ArrayList<Double>();
	ArrayList<Long> quantites = new ArrayList<Long>();
	noms.add("Apple iPad");
	noms.add("Micro Casque 588 Filaire");
	noms.add("Clavier Gaming");
	prix.add(1269.0);
	prix.add(150.0);
	prix.add(200.0);
	quantites.add(5L);
	quantites.add(10L);
	quantites.add(7L);
    Stock stock = new Stock(noms, prix, quantites);
		       int choix = -1;
		        while (choix != 5) {
		        	System.out.println("-------------------------------------");
		            System.out.println("0 - Ajouter un article");
		            System.out.println("1 - Augmenter la quantité d'un article");
		            System.out.println("2 - Modifier un article");
		            System.out.println("3 - Supprimer un article");
		            System.out.println("4 - Consulter le stock");
		            System.out.println("5 - Quitter");

		            System.out.print("votre choix : ");
		            choix = sc.nextInt();
		            sc.nextLine();

		            switch (choix) {

		                case 0:

		                    System.out.print("nom de l'article : ");
		                    String nom = sc.nextLine();

		                    System.out.print("Prix : ");
		                    double p = sc.nextDouble();

		                    System.out.print("quantit: ");
		                    long q = sc.nextLong();

		                    stock.ajouterArticle(nom, p, q);
		 
		      

		                    break;

		                case 1:

		                    System.out.print("reference de l'article : ");
		                    String ref = sc.nextLine();

		                    System.out.print("quantité à ajouter : ");
		                    long quantite = sc.nextLong();

		                 if (stock.trouverArticle(ref) != null) {
		                        stock.incrementerQuantiteArticle(ref, quantite);
		                        System.out.println("quantité augmentée ");
		                    } else {
		                        System.out.println("article introuvable ");
		                    }

		                    break;

		                case 2:

		                    System.out.print("reference de l'article : ");
		                    String reference = sc.nextLine();


		                        System.out.print("nouveau nom : ");
		                        String nouveauNom = sc.nextLine();

		                        System.out.print("nouveau prix : ");
		                        double nouveauPrix = sc.nextDouble();

		                        System.out.print("nouvelle quantite : ");
		                        long nouvelleQuantite = sc.nextLong();

		                        if (nouveauPrix < 0 || nouvelleQuantite < 0) {
		                            System.out.println("valeurs invalides");
		                        } else {
		                            stock.modifierArticle(reference, nouveauNom,
		                                    nouveauPrix, nouvelleQuantite);

		                            System.out.println("article modifié ");
		                        }

		      
		                    

		                    break;

		                case 3:

		                    System.out.print("donner la reference  : ");
		                    String refSupp = sc.nextLine();

		                    if (stock.trouverArticle(refSupp) != null) {
		                        stock.supprimerArticle(refSupp);
		                        System.out.println("Article supprime ");
		                    } else {
		                        System.out.println("Article n existe pas ");
		                    }

		                    break;

		                case 4:
		                    System.out.println(stock);

		                    System.out.println("nombre d'articles : " + stock.getArticleNb());

		                    break;

		                case 5:
		                    break;

		                default:

		                    System.out.println("choix invalide ");

		            }
		        }

		        
		   }
}