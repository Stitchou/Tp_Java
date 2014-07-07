package CoursSwing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

public class MyGridBagLayout extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	public MyGridBagLayout(String _title)
	{
		//Title
		setTitle(_title);
				
				
		//Window operations
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new MyListener());
		setResizable(false);
		//Put in middle of the screen
		setLocationRelativeTo(null);
				
		//Components
		Container ct = getContentPane();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		ct.setLayout(gbl);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		JButton jb = new JButton("Button 1");
		ct.add(jb,gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		JButton jb2 = new JButton("Button 2");
		ct.add(jb2,gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		JButton jb3 = new JButton("Button 3");
		ct.add(jb3,gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		JButton jb4 = new JButton("Button 4");
		ct.add(jb4,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		JButton jb5 = new JButton("Button 5");
		ct.add(jb5,gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		JButton jb6 = new JButton("Button 6");
		ct.add(jb6,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		JButton jb7 = new JButton("Button 7");
		ct.add(jb7,gbc);
		//Final adjustments
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
