import java.awt.*;
import javax.swing.*;

public class MyApplet extends JApplet 
{
	double euros,dollars;
	
	public void init() { euros=dollars=1.0; }
	
	public void start()
	{
		String montant_e;
		montant_e=JOptionPane.showInputDialog("Saisir un montant en euros:");
		euros=Double.parseDouble(montant_e);
		dollars=euros*1.396;
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawRect(15, 10, 270, 20);
		g.drawString("Vaut : "+dollars, 25, 25);
	}

}
