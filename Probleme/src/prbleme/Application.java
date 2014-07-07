package prbleme;

import java.util.Scanner;

public class Application {
	public static void main ( String [] args)
	{
		String retour ;
		int choix=1,nbPartie=0,score=0,nbreponse=0;
		double moyenne=0;
		Scanner joueur= new Scanner(System.in);
		
		PaquetDeCartes jeu= new PaquetDeCartes();
		jeu.Melanger();
		Carte current,next;
		while(choix==1)
		{			
				current=jeu.tirerCarte();
				next=jeu.tirerCarte();
				System.out.println("Votre carte : "+current.ConvertValeurToString()+" de "+current.ConvertCouleurtoString());
				System.out.println("\nLa carte suivante est-elle plus grande ou plus petite ? \nPlus grand tapez +\nPlus petit tapez -\nChoix :");
				retour=joueur.nextLine();
				if(retour.equals("+"))
				{
					if(current.getValeur()<next.getValeur())
					{
						score+=10;
						nbreponse++;
						System.out.println("Vous avez gagné\nScore: "+score+"\nNombre de bonnes réponses :"+nbreponse);
						System.out.println("La carte est : "+next.ConvertValeurToString()+" de "+next.ConvertCouleurtoString()+"\n");
					}
					else
					{
						System.out.println("Vous avez perduuuuuuuuu\nScore: "+score+"\nNombre de bonnes réponses :"+nbreponse);
						System.out.println("La carte etait : "+next.ConvertValeurToString()+" de "+next.ConvertCouleurtoString()+"\n");
						
						System.out.println("choisissez un mode de jeux \n1- pour recommencer tapez 1\n2- pour arrêter tapez 2\nChoix : ");
						
						retour = joueur.nextLine();
						try{
							choix=Integer.parseInt(retour);
						}
						catch (NumberFormatException e)
						{
							System.out.println("Vous n'avez pas entrer un nombre");
						}
						jeu= new PaquetDeCartes();
						jeu.Melanger();
						nbPartie++;
						score=0;
						moyenne+=nbreponse;
					}
				}
				else
				{
					if(current.getValeur()>next.getValeur())
					{
						score+=10;
						nbreponse++;
						System.out.println("Vous avez gagné\nScore: "+score+"\nNombre de bonnes réponses :"+nbreponse);
						System.out.println("Votre carte : "+next.ConvertValeurToString()+" de "+next.ConvertCouleurtoString()+"\n");
					}
					else
					{

						System.out.println("Vous avez perduuuuuuuuu\nScore: "+score+"\nNombre de bonnes réponses :"+nbreponse);
						System.out.println("La carte etait : "+next.ConvertValeurToString()+" de "+next.ConvertCouleurtoString()+"\n");
						
						System.out.println("choisissez un mode de jeux \n1- pour recommencer tapez 1\n2- pour arrêter tapez 2\nChoix : ");
						
						retour = joueur.nextLine();
						try{
							choix=Integer.parseInt(retour);
						}
						catch (NumberFormatException e)
						{
							System.out.println("Vous n'avez pas entrer un nombre");
						}
						jeu= new PaquetDeCartes();
						jeu.Melanger();
						nbPartie++;
						score=0;
						moyenne+=nbreponse;
					}
				}
			}
		
		if(nbPartie>0)
			System.out.println("Nombre de parties jouées : "+nbPartie+" Moyenne de bonnes réposnes : "+moyenne/nbPartie+" score : ");
	}
	
	

}
