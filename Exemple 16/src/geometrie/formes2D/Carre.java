package geometrie.formes2D;

public class Carre extends Geometrie2D{
	private String libelle;
	private double longueur,largeur;
	private double aire;
	public Carre(String libelle, double longueur, double largeur) {
		super();
		this.libelle = libelle;
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
}
