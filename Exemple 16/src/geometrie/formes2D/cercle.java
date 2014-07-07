package geometrie.formes2D;

public class cercle extends ellipse{

	private String libelle;
	private double rayon;
	private double aire;
	public cercle(String libelle, double rayon, String libelle2, double rayon2) {
		super(libelle, rayon);
		libelle = libelle2;
		rayon = rayon2;
	}
	
}
