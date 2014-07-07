
import javax.swing.JOptionPane;
import java.lang.*;

public class exercicedeux 
{
	static int f ( int n)
	{
		if (n%2 == 0) return n/2;
		else return 3*n+1;
	}
	public static void main(String [] args)
	{
		int nombre,compteur,petit,i;
		String valeur;
		petit=0;
		compteur=0;
		
		/*point 1
		valeur=JOptionPane.showInputDialog("Saisissez un nomre :");
		compteur=0;
		nombre=Integer.parseInt(valeur);*/
		
		/* point 2
		for(i=1;i<=50;i++)
		{
			nombre=i;			
			while( nombre!=1)
			{
				nombre=f(nombre);
				compteur++;
			}
			if(compteur<=petit)
				petit=i;
		}*/
		
		// point 3
		for(i=1;i<=50;i++)
		{
			nombre=i;			
			while( nombre!=1)
			{
				nombre=f(nombre);
				compteur++;
			}
			
		
		JOptionPane.showMessageDialog(null, "Nombre d'itérations : "+compteur,"Resultats",JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
