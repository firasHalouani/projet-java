package project;

import java.util.List;



public interface IGestionProduit {
	produits ajouterProduits(produits e);
	List<produits> rechercherProduits(String mc,String x);
	List<produits> listeProduits();
	void supprimerProduits(int id);


}
