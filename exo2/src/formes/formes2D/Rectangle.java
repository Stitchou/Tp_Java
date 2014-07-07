package formes.formes2D;

import formes.Geometrie;

public class Rectangle extends Geometrie2D implements Geometrie{
	protected String nom;
	protected double longueur;
	protected double largeur;
	

	public Rectangle(String nom, double longueur, double largeur) {
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public Rectangle(String nom,double cote)
	{
		this.nom=nom;
		this.longueur=cote;
		this.largeur=cote;
	}
	public double aire () 
	{
		return longueur*largeur;
	}
	double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

}
