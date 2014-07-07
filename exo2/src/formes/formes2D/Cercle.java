package formes.formes2D;

import formes.Geometrie;

public class Cercle extends Ellipse implements Geometrie{

	public Cercle(String nom, double rayonmin, double rayonmax) {
		super(nom, rayonmin, rayonmax);
	}


	public Cercle(String nom, double rayon) {
		super(nom, rayon);
	}


	public double aire ()
	{
		return Math.PI*rayonmax*rayonmax;
	}
}
