package techstore;
import java.util.ArrayList;

public class Stock {
		    private ArrayList<Element> articleList;

		    public Stock() {
		        articleList = new ArrayList<>();
		    }

		    public Stock(ArrayList<Element> liste) {
		        articleList = liste;
		    }

		    public Stock(ArrayList<String> noms, ArrayList<Double> prix, ArrayList<Long> quantites) {
		        articleList = new ArrayList<>();

		        for (int i = 0; i < noms.size(); i++) {
		            Article a = new Article(noms.get(i), prix.get(i));
		            articleList.add(new Element(quantites.get(i), a));
		        }
		    }

		    public ArrayList<Element> getArticleList() {
		        return articleList;
		    }

		    public int getArticleNb() {
		        return articleList.size();
		    }

		    public void setArticleList(ArrayList<Element> articleList) {
		        this.articleList = articleList;
		    }

		    public void ajouterArticle(Article article, long quantite) {
		        articleList.add(new Element(quantite, article));
		    }

		    public void ajouterArticle(String nom, double prix, long quantite) {
		        Article a = new Article(nom, prix);
		        ajouterArticle(a, quantite);
		    }

		    public Element trouverArticle(String reference) {
		        for (Element e : articleList) {
		            if (e.getArticle().getReference().equals(reference)) {
		                return e;
		            }
		        }
				return null;
		    }

		    public void modifierArticle(String reference, String nom, double prix, long quantite) {
		        Element e = trouverArticle(reference);

		        if (e != null) {
		            e.getArticle().setNom(nom);
		            e.getArticle().setPrix(prix);
		            e.setQuantite(quantite);
		        }
		    }

		    public void supprimerArticle(String reference) {
		        Element e = trouverArticle(reference);

		        if (e != null) {
		            articleList.remove(e);
		        }
		    }

		    public void incrementerQuantiteArticle(String reference, long quantite) {
		        Element e = trouverArticle(reference);

		        if (e != null) {
		            e.setQuantite(e.getQuantite() + quantite);
		        }
		    }

		    public void decrementerQuantiteArticle(String reference, long quantite) {
		        Element e = trouverArticle(reference);

		        if (e != null) {
		            e.setQuantite(e.getQuantite() - quantite);
		        }
		    }

			
			public String toString() {
				return "Stock [articleList=" + articleList + "]";
			}

		    

		}

