
import javax.swing.JOptionPane;


public class Exemple 
{
	public static void main(String [] args)
	{
		float euros,dollars;
		String montant_e,montant_d;
		
			montant_e=JOptionPane.showInputDialog("saisir un montant en euros:");
			
			euros=Float.parseFloat(montant_e);
			dollars=euros*1.396f;
			
			JOptionPane.showMessageDialog(null, "Conversion en dollars : "+dollars,"Resultats",JOptionPane.PLAIN_MESSAGE);
			
			System.exit(0);
	}
	
}
