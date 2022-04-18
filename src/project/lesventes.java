package project;

public class lesventes {
	package project;


	public class produits implements Comparable<produits>{
	private int id;
	private String code ; 
	private String nom ;
	private String prix ;
	private String remise ;
	private static int nb;

	public produits(int id, String code, String nom, String prix,String remise) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}


	public produits(String code, String nom, String prix, String remise) {
		super();
		this.id=++nb;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.remise = remise;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrix() {
		return prix;
	}


	public void setPrix(String prix) {
		this.prix = prix;
	}


	public String getRemise() {
		return remise;
	}


	public void setRemise(String remise) {
		this.remise = remise;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		produits other = (produits) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int compareTo(produits o) {
		return this.nom.compareTo(o.nom);
	}



	}


}
