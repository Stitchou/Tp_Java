package CoursSwing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyUI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private CardLayout cl = new CardLayout();
	private JPanel jp;

	public MyUI(String _titre){
		
		//Title
		setTitle(_titre);
		
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
		
		JMenuBar myMenuBar = new JMenuBar();
		JMenu myMenu1 = new JMenu("Menu 1");
		JMenuItem myItem1 = new JMenuItem("Item 1");
		JMenuItem myItem2 = new JMenuItem("Item 2");
		JMenuItem myItem3 = new JMenuItem("Item 3");
		myMenu1.add(myItem1);
		myMenu1.add(myItem2);
		myMenu1.add(myItem3);
		JMenu myMenu2 = new JMenu("Menu 2");
		JMenu myMenu3 = new JMenu("Menu 3");
		JMenu myMenu4 = new JMenu("Menu 4");
		JMenu myMenu5 = new JMenu("Menu 5");
		
		
		myMenuBar.add(myMenu1);
		myMenuBar.add(myMenu2);
		myMenuBar.add(myMenu3);
		myMenuBar.add(myMenu4);
		myMenuBar.add(myMenu5);
		
		setJMenuBar(myMenuBar);
		JPanel southPanel = new JPanel();
		JButton prev = new JButton("<==");
		JButton next = new JButton("==>");
		prev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				cl.previous(jp);		
			}		
		});
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				cl.next(jp);		
			}		
		});
		southPanel.add(prev);
		southPanel.add(next);
		
		
		jp = new JPanel(cl);
		JPanel p1 = new JPanel();
		String[] array = {"France","Maroc","Etats-Unis"};
		DefaultListModel lm = new DefaultListModel();
		lm.addElement("France");
		lm.addElement("Maroc");
		lm.addElement("Etats-Unis");
		JList newList = new JList(lm);
		//newList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		//newList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		//newList.setVisibleRowCount(-1);
		p1.add(newList);
		Dessin des = new Dessin();
		JPanel p3 = new JPanel();
		JLabel j3 = new JLabel("CARD 3");
		p3.add(j3);
		
		
		jp.add(des, "c1");
		jp.add(p1, "c2");
		jp.add(p3, "c3");
		//ct.add(b1,BorderLayout.NORTH);
		//ct.add(b2,BorderLayout.WEST);
		ct.add(jp,BorderLayout.CENTER);
		//ct.add(b4,BorderLayout.EAST);
		ct.add(southPanel,BorderLayout.SOUTH);
		
		
		
		//Make visible
		setVisible(true);
	}

	



}
