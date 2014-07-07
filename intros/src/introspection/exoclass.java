package introspection;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class exoclass 
{
	public static void main (String [] args) throws Exception 
	{
	
		int i;
		String nom=JOptionPane.showInputDialog("Entrez le nom d'une classe");
		System.out.println("Arbre de dérivation de : "+nom );
		try 
		{
			Class<?> c = Class.forName(nom);
			Method  d[];
			 while (c != null )
		        {
		        	System.out.println( c.getName());
		        	d=c.getDeclaredMethods();
		        	for(i=0;i<d.length;i++) 
		        		System.out.println("\t"+d[i].getName());
		        	c=c.getSuperclass();
		        }
		}
		catch (Exception e)
		{
			System.out.println("Erreur : \nMsg : "+e.getMessage()+"\nCause : "+e.getCause());
		}      
	}
}
