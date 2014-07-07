package formes.formes2D;

import formes.Geometrie;

public class Ellipse extends Geometrie2D implements Geometrie{
	protected String nom;
	protected double rayonmin;
	protected double rayonmax;
	
	public Ellipse(String nom, double rayonmin, double rayonmax) {
		this.nom = nom;
		this.rayonmin = rayonmin;
		this.rayonmax = rayonmax;
	}
	
	public Ellipse(String nom, double rayon)
	{
		this.nom=nom;
		this.rayonmax=rayon;
	}
	public double aire ()
	{
		return Math.PI*rayonmax*rayonmin;
	}

	double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
