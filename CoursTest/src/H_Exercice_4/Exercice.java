package H_Exercice_4;

public class Exercice {

	public static void main(String[] args) {
		Ouvrier r1 = new Ouvrier("Dupond",1500,1,169);
		Ouvrier r2 = new Ouvrier("Durand",1500,2,182);
		Ouvrier r3 = new Ouvrier("Leclerc",1500,3,167);
		Employe.afficherTous();
		r3.supprimer();
		System.out.println("-------------------------------------");
		Employe.afficherTous();
		r3.supprimerTous();
		System.out.println("-------------------------------------");
		Employe.afficherTous();
	}

}
