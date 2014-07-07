package eleve;

public class mzin {
	public static void main(String [] args) 
	{
		boolean retour;
		celeve lui= new celeve();
		celeve elle=new celeve();
		lui.setNom("toto");
		elle.setNom("toto");
		lui.setMoyenne(0);
		elle.setMoyenne(0);
		retour = lui.equals(elle);
		System.out.println(retour);
		
	}
}
