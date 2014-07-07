package arithm;

public class delegue {
	
	private int deage,dpage;
	public delegue () 
	{
		deage=0;
		dpage=0;
	}
	public int getDeage() {
		return deage;
	}
	public void setDeage(int deage) {
		this.deage = deage;
	}
	public int getDpage() {
		return dpage;
	}
	public void setDpage(int dpage) {
		this.dpage = dpage;
	}
	public int calcul(int age, int parent)
	{
	  int valeur; 
	  valeur=age*2;
	  valeur+=5;
	  valeur*=50;
	  valeur+=parent;
	  valeur-=365;
	  return valeur;
	}

}
