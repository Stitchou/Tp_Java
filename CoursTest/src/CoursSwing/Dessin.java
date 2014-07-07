package CoursSwing;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Dessin extends JPanel{
	
	
	public Dessin(){
		super();
	}
	public void paintComponents(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.GREEN);
        g.drawLine(1,1,20,20);
        g.setColor(Color.BLACK);
        
	}

}
