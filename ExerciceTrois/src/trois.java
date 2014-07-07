import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;


public class trois 
{
	public static void Affichetab(int moyenne)
	{
		JOptionPane.showMessageDialog(null,"La moyenne est "+ moyenne ,"Moyenne",1);
	}
	
	public static void Test (String [] tab) throws NumberFormatException
	{
		int i, taille, total, erreur;
		char valeur;
		taille=tab.length;
		total=0;
		erreur=0;
		for(i=0;i<taille;i++)
		{
			try
			{
					total+=Integer.parseInt(tab[i]);			
			}
			catch(NumberFormatException e) 
			{
				erreur++;
				// méthode 2 
				JOptionPane.showMessageDialog(null, tab[i]+" N'est pas un entier ","Erreur charactère",1);
				throw new NumberFormatException();
			}
		}
		Affichetab(total/(taille-erreur));
	}
	
	public static void main(String [] args) 
	{
		
		String [] valeur;
		String nombre;
		int taille;
		
		nombre=JOptionPane.showInputDialog(" Combien de valeur à entrez ?");
		
		taille=Integer.parseInt(nombre);
		
		valeur=new String[taille];
		for(int i=0;i<taille;i++)
		{
			valeur[i]=JOptionPane.showInputDialog("Entrez vos entiers ");
		}
		try
		{
			Test(valeur);
		}
		catch (NumberFormatException e)		
		{
			JOptionPane.showMessageDialog(null, "fonction erronée : Test");
			//throw new NumberFormatException();
			throw new RuntimeErrorException(null);
		}
		
		
	}

}
