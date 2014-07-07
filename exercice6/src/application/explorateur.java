package application;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import application.fichier;

public class explorateur implements filtre{
	ArrayList <fichier> liste =new ArrayList<fichier>();
	
	public void affichFichier()
	{
		int i;
		for(i=0;i<liste.size();i++)
		{
			fichier fic=liste.get(i);
			fic.affiche();
		}
	}
	
	public int CalcTaille()
	{
		int i,resultat=0;
		char c;
		for(i=0;i<liste.size();i++)
		{
			fichier fic=liste.get(i);
			c=fic.getType();
			if( c=='F')
				resultat+=fic.getTaille();
		}
		return resultat;
	}
	public void moreUse()
	{
		int i,save=0;
		GregorianCalendar date = null;
		fichier fic;
		for(i=0;i<liste.size();i++)
		{
			fic=liste.get(i);
			if(i==0)
				date=fic.getModification();
			else
				if(date.before(fic.getModification()))
				{
						date=fic.getModification();
						save=i;
				}
		}
		fic=liste.get(save);
		fic.affiche();
	}
	/*public void affiche(filtre)
	{
		explorateur o implements filtre = new explorateur();
	}*/


	public boolean valide(fichier f) {
		// TODO Auto-generated method stub
		return false;
	}}
