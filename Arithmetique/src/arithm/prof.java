package arithm;

public class prof {
	private int resultat,elev,paren;
	
	public prof()
	{
		resultat=0;
		elev=0;
		paren=0;
	}
	
	public void traitement (delegue d,eleve e)
	{
		System.out.println("Délégué arrive ");
		System.out.println("Professeur: début du tour ");
		System.out.println("Eleve écrit papier ");
		papier papi= new papier();
		papi.setAgee(e.getAge());
		papi.setAgep(e.getParent());
		System.out.println("Eleve montre papier ");
		System.out.println("Délégué lit  papier ");
		System.out.println("Délégué calcule ");
		resultat=d.calcul(papi.getAgee(),papi.getAgep());
		System.out.println("Délégué annonce résultat : "+resultat);
		System.out.println("Profeseur annonce âge élève : "+(resultat+115)/100+" et âge parent : "+(resultat+115)%100);
		
	}
	

}
