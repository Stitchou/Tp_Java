package tpGraphique;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;


public class exo1bis extends JFrame {
	//composant graphique
	private JScrollPane fenetre = new JScrollPane();
	private JScrollPane fen2= new JScrollPane();
	private JMenuBar menu= new JMenuBar();
	private JMenu fichier = new JMenu("Fichier");
	private JMenu option = new JMenu("Option");
	private JMenuItem envoyer = new JMenuItem("Envoyer");
	private JMenuItem quitter = new JMenuItem("Quitter");
	private static final long serialVersionUID = 1L;
	private JTextArea texte = new JTextArea();
	private JTextArea rendu = new JTextArea();
    private JFrame visu = new JFrame();
	private Toolkit tk=Toolkit.getDefaultToolkit();
	private JButton jb = new JButton("Envoyer" );
	//taille écran
	private Dimension d = tk.getScreenSize();
	// test container
	private Container ct = getContentPane();
	private Container ct2 = visu.getContentPane();
	
	
	 
	
	

	public exo1bis () {
		
		quitter.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	quitterActionPerformed();
	        }
		});
		envoyer.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	envoyerActionPerformed();
	        }
		});
		jb.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	envoyerActionPerformed();
	        }
		});
		
	
		
		menu.add(fichier);
		menu.add(option);
		fichier.add(envoyer);
		fichier.add(quitter);
		
		setJMenuBar(menu);
		
		fenetre.setViewportView(texte);
		fen2.setViewportView(rendu);
		ct2.add(fen2);
		
		ct.add(fenetre);
		ct.add(jb,BorderLayout.SOUTH);
		setTitle("Exercie 2");
		setSize(d.height/4,(d.width/4)-100);
		setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		visu.setSize(d.width/4,d.height/2);
		visu.setResizable(false);
		visu.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	
	
	// item menu quitter
	public void quitterActionPerformed() {                                           
	   
		this.setVisible(false);
	   System.exit(1);
	}
	public void envoyerActionPerformed() {                                           		
		rendu.setText(texte.getText());
		visu.setVisible(true);	
	}
	
}// fin class 
