package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;




public class gestionProduit implements IGestionProduit {
   List<produits> liste=new ArrayList<produits>();
	@Override
	public produits ajouterProduits(produits e) {
		liste.add(e);
		return e;
	}
	@Override
	public List<produits> listeProduits() {
		return liste;
	}

	@Override
	public void supprimerProduits(int id) {
		
		for(Iterator<produits>ll=liste.iterator();ll.hasNext();)
		{  produits e=ll.next();
			if(e.getId()==id)
			{
				liste.remove(e);
				break;
			}
		}
		
	}
	@Override
	public List<produits> rechercherProduits(String mc,String x) {
		List<produits> l=new ArrayList<produits>();
		for(produits e:liste) {
			switch(x) {
			case "code": if(e.getCode().contains(mc)) l.add(e);
			case "nom": if(e.getNom().contains(mc)) l.add(e);
			case "prix": if(e.getPrix().contains(mc)) l.add(e);
			case "remise": if(e.getRemise().contains(mc)) l.add(e);
			case "fournisseur": if(e.getFournisseur().contains(mc)) l.add(e);

			}
		}
		return l;
	}
}

