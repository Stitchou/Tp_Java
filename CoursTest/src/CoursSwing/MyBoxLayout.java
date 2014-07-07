package CoursSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyBoxLayout extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyBoxLayout(String _title){
		//Title
		setTitle(_title);
				
		//Dimensions
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width/2,screenSize.height/2);
				
				
		//Window operations
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new MyListener());
		setResizable(false);
		//Put in middle of the screen
		setLocationRelativeTo(null);
				
		//Components
		Container ct = getContentPane();
		Box b = Box.createHorizontalBox();
		b.add(new JButton("Button 1"));
		b.add(new JButton("Button 2"));
		b.add(new JButton("Button 3"));
		b.add(new JButton("Button 4"));
		ct.add(b);
		
		//Final adjustments
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
