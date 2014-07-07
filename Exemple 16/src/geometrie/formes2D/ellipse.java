package geometrie.formes2D;

public class ellipse extends Geometrie2D{

	private String libelle;
	private double rayon;
	public ellipse(String libelle, double rayon) {
		this.libelle = libelle;
		this.rayon = rayon;
	}
	private double aire;
}
