package formes;

import formes.formes2D.*;
import formes.formes3D.*;

public class Appli {

	public static void main (String [] args)
	{
		Rectangle r = new Rectangle("Mon rectangle", 5,10);
		System.out.println(r.aire());
		Carre c= new Carre("Mon carre",5);
		System.out.println(c.aire());
		Cercle cer= new Cercle("Mon Cerlcel",4);
		System.out.println(cer.aire());
		Ellipse el= new Ellipse("Mon ellipse",10,6);
		System.out.println(el.aire());
	}
}