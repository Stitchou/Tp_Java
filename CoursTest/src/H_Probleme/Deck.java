package H_Probleme;

import java.util.Random;

public class Deck {

	private Card[] playDeck = new Card[52];
	private int leftCards;
	
	
	public Deck()
	{
		leftCards = 52;
		int k = 0;
		for(int i =1001; i< 1005;i++)
		{
			for(int j=1;j<14;j++)
			{
				playDeck[k] = new Card(j,i);
				k++;
			}
		}
	}
	
	public void printDeck()
	{
		System.out.println("Nombre de cartes restantes : " +nbCartesRestantes());
		for(int i =0; i < nbCartesRestantes(); i++)
		{
			System.out.println(playDeck[i].convValueToString()+" de "+playDeck[i].convColorToString());
		}
	}
	public void melanger()
	{
		Random randIndex = new Random();
		int newIndex;
		int tempColor,tempValue;
		for(int i = 0; i < nbCartesRestantes(); i++)
		{
			newIndex = randIndex.nextInt(nbCartesRestantes());
			
			tempColor = playDeck[i].getColor();
			tempValue = playDeck[i].getValue();
			playDeck[i] = new Card(playDeck[newIndex].getValue(),playDeck[newIndex].getColor());
			playDeck[newIndex] = new Card(tempValue,tempColor);
		}
	}
	
	public int nbCartesRestantes()
	{
		return leftCards;
	}
	
	public boolean estVide()
	{
		if(0==leftCards)
			return true;
		else
			return false;
	}
	public Card tirerCarte()
	{
		while(!estVide())
		{
			leftCards--;
			return playDeck[leftCards];
		}
		return null;
	}
}
