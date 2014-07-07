package prbleme;

public class Carte extends CartesGeneriques implements ConstantesCartes{

	int figure,couleur;
	
	public int getCouleur() {
		
		return couleur;
	}

	public int getValeur() {

		return figure;
	}

	public String ConvertCouleurtoString() {

		if(couleur==Trefle)
			return "Trefle";
		else if (couleur==Pique)
			return "Pique";
		else if (couleur==Coeur)
			return "Coeur";
		else
			return "Carreau";
	}

	public String ConvertValeurToString() {

		if(figure==as)
			return "AS";
		else if(figure==valet)
			return "Valet";
		else if(figure==dame)
			return "Dame";
		else if(figure==roi)
			return "Roi";
		else 
			return String.valueOf(figure);
	}

	public Carte(int figure, int couleur) {
		this.figure = figure;
		this.couleur = couleur;
	}
	
	
}
