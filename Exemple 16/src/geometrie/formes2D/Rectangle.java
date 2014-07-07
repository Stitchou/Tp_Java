package geometrie.formes2D;

public class Rectangle extends Geometrie2D{
	private String libelle;
	private double longueur,largeur;
	public Rectangle(String libelle, double longueur, double largeur) {
		super();
		this.libelle = libelle;
		this.longueur = longueur;
		this.largeur = largeur;
	}
	private double aire;
}
