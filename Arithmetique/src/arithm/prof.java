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
		System.out.println("D�l�gu� arrive ");
		System.out.println("Professeur: d�but du tour ");
		System.out.println("Eleve �crit papier ");
		papier papi= new papier();
		papi.setAgee(e.getAge());
		papi.setAgep(e.getParent());
		System.out.println("Eleve montre papier ");
		System.out.println("D�l�gu� lit  papier ");
		System.out.println("D�l�gu� calcule ");
		resultat=d.calcul(papi.getAgee(),papi.getAgep());
		System.out.println("D�l�gu� annonce r�sultat : "+resultat);
		System.out.println("Profeseur annonce �ge �l�ve : "+(resultat+115)/100+" et �ge parent : "+(resultat+115)%100);
		
	}
	

}
