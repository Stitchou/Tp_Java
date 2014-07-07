package application;

import java.util.GregorianCalendar;

public class fichier {

	private String nom;
	private char type;
	private int taille;
	private GregorianCalendar creation,modification;
	
	public fichier ()
	{
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public GregorianCalendar getCreation() {
		return creation;
	}

	public void setCreation(GregorianCalendar creation) {
		this.creation = creation;
	}

	public GregorianCalendar getModification() {
		return modification;
	}

	public void setModification(GregorianCalendar modification) {
		this.modification = modification;
	}

	public fichier(String nom, char type, int taille,
			GregorianCalendar creation) {
		this.nom = nom;
		this.type = type;
		this.taille = taille;
		this.creation = creation;
	}
	
	int compareTo(Object o)
	{
		fichier test = (fichier) o;
		return nom.compareTo(test.nom);	
	}
	public void affiche()
	{
		System.out.println("Nome:"+nom+" taille:"+taille+" date de création"+creation+" modifié le :"+modification+" type:"+type );
	}
	
}
