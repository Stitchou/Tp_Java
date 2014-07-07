package arithm;
import javax.swing.JOptionPane;

public class eleve extends application
{

	private int age,parent;
	private static String valeur;

	public eleve ()
	{
		age=0;
		parent=0;	
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	
	public void init () throws NumberFormatException
	{
		System.out.println("Eleve choisi ");
		valeur=JOptionPane.showInputDialog("Entrez age eleve :");
		try
		{
			this.age=Integer.parseInt(valeur);
		}
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, valeur+" N'est pas un entier ","Erreur charactère",1);	
		}
		valeur=JOptionPane.showInputDialog("Entrez age parent :");
		try
		{
			this.parent=Integer.parseInt(valeur);
		}
		catch (NumberFormatException e) 
		{
			throw new NumberFormatException();
		}
		
	}
}
