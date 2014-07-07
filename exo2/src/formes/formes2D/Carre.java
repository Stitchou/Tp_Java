package formes.formes2D;

import formes.Geometrie;

public class Carre extends Rectangle implements Geometrie{
	
	public Carre(String nom, double longueur, double largeur) {
		super(nom, longueur, largeur);
	}
	
	
	public Carre(String nom, double longueur) {
		super(nom, longueur);
	}


	public double aire () 
	{
		return longueur*largeur;
	}
	

}
