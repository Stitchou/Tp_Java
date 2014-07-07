package coursinterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Toolkit tk=Toolkit.getDefaultToolkit();
	JButton jb = new JButton("OK B1" );
    JButton jb2 = new JButton("OK B2" );
    JButton jb3 = new JButton("OK B3" );
    JButton jb4 = new JButton("OK B4" );
    JButton jb5 = new JButton("OK B5" );
    JButton jb6 = new JButton("OK B6" );
    JButton jb7 = new JButton("OK B7" );
    JButton jb8 = new JButton("OK B8" );
    JButton jb9 = new JButton("OK B9" );
    JButton jb10 = new JButton("OK B10" );
    JButton jb11 = new JButton("OK B11" );
    
	public MyUI()
	{
		// listeneur 
		Ecouteur ec= new Ecouteur();
		addWindowListener(ec);
		// taille écran
		Dimension d = tk.getScreenSize();
		
		// test boutton
		Container ct = getContentPane();
	    
	    /*jb.setBackground(Color.cyan);
	    jb2.setBackground(Color.red);
	    jb3.setBackground(Color.yellow);
	    jb4.setBackground(Color.GREEN);
	    jb5.setBackground(Color.magenta);
	   */
	    
	    /*JPanel jp = new JPanel();
	    JPanel jp2 = new JPanel();
	   //GridLayout gl = new GridLayout(2,2);
	    GridBagLayout gbl = new GridBagLayout();
	    GridBagConstraints gbc = new GridBagConstraints();
	    ct.setLayout(gbl);
	    
	    // 1er boutton
	    gbc.gridx=0;
	    gbc.gridy=0;
	    gbc.gridwidth=2;
	    gbc.gridheight=1;
	    gbc.fill=GridBagConstraints.BOTH;
	    ct.add(jb,gbc);
	    
	    //2eme
	    gbc.gridx=2;
	    gbc.gridwidth=1;
	    ct.add(jb2,gbc);
	    
	    //3eme
	    gbc.gridx=0;
	    gbc.gridy=1;
	    gbc.gridwidth=1;
	    gbc.gridheight=1;
	    ct.add(jb3,gbc);
	    
	    //4eme
	    gbc.gridx=1;
	    gbc.gridwidth=2;
	    ct.add(jb4,gbc);
	    
	    //5eme
	    gbc.gridx=0;
	    gbc.gridy=2;
	    gbc.gridwidth=1;
	    ct.add(jb5,gbc);
	    
	    //6eme
	    gbc.gridx=1;
	    gbc.gridwidth=1;
	    ct.add(jb6,gbc);
	    
	    //7eme
	    gbc.gridx=2;
	    gbc.gridwidth=1;
	    ct.add(jb7,gbc);
	   */
	   
	    
	    /*
	    jp2.setLayout(gbl);
	    jp2.add(jb8);
	    jp2.add(jb9);
	    jp2.add(jb10);
	    jp2.add(jb11);
	    ct.add(jp2);
	    ct.add(jb2,BorderLayout.WEST);
	    ct.add(jb3, BorderLayout.NORTH);
	    ct.add(jb4, BorderLayout.EAST);
	    jp.add(jb5);
	    jp.add(jb6);
	    jp.add(jb7);
	    ct.add(jp, BorderLayout.SOUTH);
		*/
	    Box b=Box.createHorizontalBox();
	    b.add(jb);
	    b.add(jb2);
	    b.add(jb3);
	    b.add(jb4);
	    ct.add(b);
	    Box b2=Box.createVerticalBox();
	    b2.add(jb5);
	    b2.add(jb6);
	    b2.add(jb7);
	    b2.add(jb8);
	    ct.add(b2);
		// paramétrage de la fenetre 
		setTitle("Exemple");
		//setSize(d.width/2,d.height/2);
		pack();
		setResizable(true);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		setVisible(true);		
	}
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, arg0.getActionCommand());
	}
}
