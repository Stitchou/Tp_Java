package prbleme;

import java.util.ArrayList;
import java.util.Collections;

public class PaquetDeCartes {

	private ArrayList<Carte> liste = new ArrayList<Carte>();
	
	public ArrayList<Carte> getListe() {
		return liste;
	}
	
	public void setListe(ArrayList<Carte> liste) {
		this.liste = liste;
	}
	
	public PaquetDeCartes ()
	{
		int i,j;
		for(i=20;i<24;i++)
		{
			for(j=1;j<14;j++)
				liste.add(new Carte(j,i));
		}
	}
	
	public void Melanger()
	{
		Collections.shuffle(liste);
	}
	public int NbCarterestantes()
	{
		return liste.size();
	}
	public boolean estVide()
	{
		return liste.isEmpty();
	}
	public Carte tirerCarte()
	{
		Carte tmp=liste.get(0);
		liste.remove(0);
		return tmp;		
	}
}
