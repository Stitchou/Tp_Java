import javax.swing.JOptionPane;


public class quatre 
{
	public static void gauche(int nombre, String mot)
	{
		String debut,fin,concat;
		debut=mot.substring(0,mot.length()-nombre);
		fin=mot.substring(mot.length()-nombre,mot.length());
		concat=fin+debut;
		//JOptionPane.showMessageDialog(null, concat);
		System.out.println(concat);
		
	}
	public static void droite(int nombre, String mot)
	{
		gauche(nombre,mot);
	}
	
	public static void isannagramme( String mot1, String mot2)
	{
	       boolean anagramme = true;
	   	int i = 0;
	   	
	   	while ( i < mot1.length() && anagramme == true )
	   	{
	   		if ( mot2.indexOf( mot1.charAt(i) ) == -1 )
	   			anagramme = false;
	   		else  i++;
	   	}
	   	if ( anagramme == false )
	   	{
	   		System.out.println("Ce n'est pas un anagramme");
	   	    return ;
	   	}
	   			
	   	
	   	anagramme = true;
	   	
	   	i = 0;
	   	while ( i < mot2.length() && anagramme == true ){
	   		if ( mot1.indexOf( mot2.charAt(i) )  == -1 )
	   			anagramme = false;
	   		else i++;
	   	}
	   	if ( anagramme == false )
	   		System.out.println("Ce n'est pas un anagramme");
	   	else
			System.out.println("c'est un annagramme");
	   	return ;
	}
	public static void main(String [] args) 
	{
		String alphabet, mots , symbole , chaine;
		alphabet=args[0];
		mots=args[1];
		symbole=args[2];
		//chaine=args[3];
		
	/*	
		// point 1 
		 alphabet=alphabet.toLowerCase();
		 
		mots=mots.toLowerCase();
		int i,j,trouver,fin;
		i=0;
		fin=0;
		while(i<mots.length())
		{
			j=0;
			trouver=0;
			while(j<alphabet.length())
			{
				if(mots.charAt(i)==alphabet.charAt(j))
					trouver++;
				j++;
			}
			if(trouver==0)
				{
					System.out.println("Le mot n'est pas bien formée");
					break;
				}
			else
				fin++;
			i++;
		}
		
		//point 2 et 3 
		//gauche(Integer.parseInt(alphabet),mots); */
		if(symbole.equals("/a"))
		{
			isannagramme(alphabet,mots);
		}
		/*if(symbole.equals("/o"))
		{
			if( mots.contains(chaine) )
				mots=mots.replace(chaine,"");
			
			System.out.println(mots);
		}
		
		ne marche pas 
		else if(symbole.equals("/f") )
		{
			int compteur;
			compteur=0;
			
			if( mots.contains(chaine) )
					compteur++;
			
		}
		else if(symbole.equals("/an"))
		{
			
		}*/
		
	}

}
