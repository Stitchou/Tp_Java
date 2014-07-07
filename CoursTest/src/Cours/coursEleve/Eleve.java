package Cours.coursEleve;

public class Eleve implements Cloneable,Comparable{

		private String nom;
		private float moyenne;
		private Address adr;
		
		public Eleve()
		{
		}
		public Eleve(String _s, float _f , String _adr)
		{
			nom = _s;
			moyenne = _f;
			adr = new Address(_adr) ;
		}
		public Address getAdr() {
			return adr;
		}
		public void setAdr(String _adr) {
			this.adr.setTemp(_adr);
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public float getMoyenne() {
			return moyenne;
		}
		public void setMoyenne(float moyenne) {
			this.moyenne = moyenne;
		}
		
		public void print(){
			System.out.println("Nom : "+nom+" / Moyenne : "+moyenne +" / Adresse : "+adr.getTemp());
		}
		public Eleve compare(Eleve _e)
		{
			if(nom.compareTo(_e.nom)<0)return _e;
			else return this;
		}

		public boolean equals(Object obj)
		{
			 if(obj instanceof Eleve)
			 {
				 if(((Eleve) obj).nom.equals(nom))
					 if(((Eleve) obj).moyenne == moyenne)
						 return true;
			 }
			 return false;
		}
		
		public Object clone(){
			try
			{
				Eleve e = (Eleve)super.clone();
				e.adr = (Address)adr.clone();
				return e;
			}
			catch (CloneNotSupportedException cnse)
			{
				return null;
			}
		}
		@Override
		public int compareTo(Object obj) {
			if(obj instanceof Eleve)
			{
				if(((Eleve) obj).moyenne<this.moyenne)
					return 1;
				else if(((Eleve) obj).moyenne==this.moyenne)
					return 0;
				else
					return -1;
			}
			else
				return 0;
		}
		
}
