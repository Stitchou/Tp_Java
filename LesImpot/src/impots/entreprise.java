package impots;

public class entreprise extends Batiment{
	private String nom;
	private int nbemploye=0,livraison=0,surface=0;
	public int impot() {
		return (int)6.3*surface;
	}
	public void affich() {
	
		System.out.println("Entreprise :"+nom+" Nombre d'employes :"+nbemploye+"Nb de livraison : "+livraison+" surface : "+surface);		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbemploye() {
		return nbemploye;
	}
	public void setNbemploye(int nbemploye) {
		this.nbemploye = nbemploye;
	}
	public int getLivraison() {
		return livraison;
	}
	public void setLivraison(int livraison) {
		this.livraison = livraison;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	
	public entreprise(String proprietaire, String adresse, int surface) {
		super(proprietaire, adresse, surface);
		// TODO Auto-generated constructor stub
	}
	public entreprise(String nom, int nbemploye, int livraison, int surface) {
		this.nom = nom;
		this.nbemploye = nbemploye;
		this.livraison = livraison;
		this.surface = surface;
	}

}
