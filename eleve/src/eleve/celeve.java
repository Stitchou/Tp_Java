package eleve;

public class celeve implements Cloneable {
	
		public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Adresse getAdr() {
		return adr;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	public float getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
		private String nom;
		private float moyenne;
		private Adresse adr;
		
public celeve compare (celeve premier)
{
	int resultat;
	resultat = premier.nom.compareTo(this.nom);
	if(resultat<0)
		return premier;
	else 
		return this;
}

public boolean equals (Object o)
{
	if(!(o instanceof celeve))
		return false;
	celeve test= (celeve) o ;
	return test.nom.equals(nom)&&test.moyenne==moyenne;
	
}

public Object clone ()
{
	try{
		celeve tmp= (celeve) super.clone();
		tmp.adr = (Adresse) this.adr.clone();
		return tmp;
	}
	catch (CloneNotSupportedException e)
	{
		return null;
	}
}

}

