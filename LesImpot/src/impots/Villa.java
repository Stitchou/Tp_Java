package impots;

public class Villa extends Batiment{
	public Villa(String proprietaire, String adresse, int surface) {
		super(proprietaire, adresse, surface);
		
	}
	
	private int nbPieces=0;
	private boolean piscine=false;
	
	
	public int impot() {
		return (piscine)  ?750+nbPieces*100:nbPieces*100 ;
	}

	public void affich() {
	System.out.println("nombre de pieces :"+nbPieces+" avec piscine "+piscine);	
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public boolean isPiscine() {
		return piscine;
	}

	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
	}

	

}
