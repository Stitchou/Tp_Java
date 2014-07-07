package impots;

public abstract class Batiment {
	  protected String proprietaire,adresse;
	  protected int surface,nbpiece;
	  protected String nom;
	  protected int nbemploye, livraison;
	  abstract int impot();
	  abstract void affich();
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public Batiment(String proprietaire, String adresse, int surface) {
		super();
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;
	}
	public Batiment(String nom, int nbemploye, int livraison, int surface) {
	}
	
}
