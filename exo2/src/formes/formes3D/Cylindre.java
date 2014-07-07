package formes.formes3D;

import formes.Geometrie;

public class Cylindre extends Geometrie3D implements Geometrie{
	private String nom;
	private double rayon;
	private double hauteur;
	
	public Cylindre(String nom, double rayon, double hauteur) {
		this.nom = nom;
		this.rayon = rayon;
		this.hauteur = hauteur;
	}

	public double aire() {
		// TODO Auto-generated method stub
		return 0;
	}

	double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
