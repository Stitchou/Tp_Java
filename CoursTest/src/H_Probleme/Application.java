package H_Probleme;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args){
		Icon icon = new ImageIcon("icon.gif");
		Deck deckDeJeu; 
		int score = 0;
		Card actualCard,nextCard;	
		String choice = null;
		int nbParties = 0;
		int totalScore = 0;
		float moyenne;
		Object o[] = {"Lancer une partie","Voir mes statistiques"};
		JFrame frame = new JFrame("Problème de M.Sananes");
		do
		{
			choice =  (String) JOptionPane.showInputDialog(frame, "Bienvenue dans Devine le Score !\n\n\n\n","Devine le Score !",JOptionPane.INFORMATION_MESSAGE, icon, o,o[0]);
			if(choice == null)
				System.exit(0);
				switch(choice)
				{
				case "Lancer une partie": 
					score = 0;
					nbParties++;;
					deckDeJeu =  new Deck();
					deckDeJeu.melanger();
					nextCard = deckDeJeu.tirerCarte();
					Object o2[] = {"+","-"};
					
					while(!deckDeJeu.estVide())
					{
						actualCard = nextCard;
						choice = (String) JOptionPane.showInputDialog(frame, "                                 Score actuel : "+score+"                             \n\n\n"+
								"Cartes restantes dans le deck : "+deckDeJeu.nbCartesRestantes()+"\n" +
								"Vous avez pioché : "+actualCard.convValueToString()+" de "+actualCard.convColorToString()+"\n" +
								"Valeur de la carte : "+actualCard.getValue()+"\n"+
								"\n\n\nDevinez le score de la prochaine carte !\nCliquez sur Annuler pour quitter (La partie de ne sera pas compter)\n\n\n",
								"Partie n°"+nbParties,JOptionPane.INFORMATION_MESSAGE, icon, o2, o2[0]
								);
						nextCard = deckDeJeu.tirerCarte();
						if(choice == null)
							System.exit(0);
						if(choice.equals("+"))
						{
							if(nextCard.getValue()>=actualCard.getValue())
							{
								score++;
							}
							else
								break;
						}
						else if(choice.equals("-"))
						{
							if(nextCard.getValue()<actualCard.getValue())
							{
								score++;
							}
							else
								break;
						}
								
					}
					totalScore += score;
					choice = "temp";
					break;
				case "Voir mes statistiques": 
						if(nbParties == 0)
							moyenne = 0.f;
						else
							moyenne = (float) totalScore/nbParties;
						JOptionPane.showMessageDialog(frame, "			Vos statistiques : \n" +
						"- Nombre de parties jouées : "+nbParties+"\n" +
						"- Nombre de bonnes reponses : "+totalScore+"\n" +
						"- Moyenne par partie : "+moyenne+"\n\n\n",
						"Vos Statistiques",JOptionPane.INFORMATION_MESSAGE, icon);
					choice ="temp";
					break;
				default: break;
				}
		}while(true);
		
		
		
			
	}
	
	public static boolean isNumeric(String s) {  
	    return s.matches("[-+]?\\d*\\.?\\d+");  
	}  

}
