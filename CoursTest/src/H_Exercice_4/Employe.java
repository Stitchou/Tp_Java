package H_Exercice_4;

abstract class Employe {
	
		Personne origine;
		float salaire;
		int service;
		protected Employe suiv;
		private static Employe listeDesSalaries = null;
		
		
		public Employe(String n, float sl, int sv) {
			origine = new Personne(n);
			salaire = sl;
			service = sv;
			suiv = listeDesSalaries;
			listeDesSalaries = this;
		}
		
		public static void afficherTous() {
			Employe tmp = listeDesSalaries;
			while(tmp != null)
			{
				System.out.println("Employe// Nom : "+tmp.origine.nom+"/ Salaire : "+tmp.salaire + "/ Service : "+tmp.service);
				tmp = tmp.suiv;
			}
		}
		
		public void supprimerTous() {
			listeDesSalaries = null;
		}
		
		public void supprimer() {
			Employe tmp = listeDesSalaries;
			Employe newListe = null;
			while(tmp != null)
			{
				if(tmp.origine.nom == origine.nom && tmp.salaire == salaire && tmp.service == service)
				{
					tmp = tmp.suiv;
				}
				else
				{
					suiv = newListe;
					newListe = this;
					tmp = tmp.suiv;
				}
					
			}
			listeDesSalaries = newListe;
		}
		
		abstract void afficher();
}
