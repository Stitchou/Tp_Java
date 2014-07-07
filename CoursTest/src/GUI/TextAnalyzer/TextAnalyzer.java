package GUI.TextAnalyzer;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import CoursSwing.MyListener;


public class TextAnalyzer extends JFrame implements DocumentListener{
		private JTextArea jta;
		private JTextArea modif;
		private String newLine = "\n";
		public TextAnalyzer(String _title)
		{
			super();
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
			setLocationRelativeTo(null);
			//Setting up inteface
			
			Container ct = getContentPane();
			Box b = Box.createVerticalBox();
			
			jta = new JTextArea(getWidth(),600);
			jta.getDocument().addDocumentListener(this);
			JScrollPane jsp = new JScrollPane(jta);
			jta.setEditable(true);
			b.add(jsp);
			
			
			modif = new JTextArea(getWidth(),280);
			modif.setEditable(false);
			b.add(new JLabel("Logs d'analyse du texte"));
			JButton lol = new JButton("Clear Log");
			lol.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					modif.setText("");
					
				}
				
			});
			JScrollPane jsp2 = new JScrollPane(modif);
			b.add(lol);
			b.add(jsp2);
			
			ct.add(b);
			
			//Make it visible
			
			setVisible(true);
		}
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		       new TextAnalyzer("Calculs sur texte");
		    }
		});

	}

	public void insertUpdate(DocumentEvent e) {
        updateLog(e, "inserted");
    }
    public void removeUpdate(DocumentEvent e) {
        updateLog(e, "removed");
    }
    public void changedUpdate(DocumentEvent e) {
        //Plain text components do not fire these events
    }
    
    public int getLines(String temp)
    {
    	int counter = 1;
    	for( int i=0; i<temp.length(); i++ ) {
    	    if( temp.charAt(i) == '\n' ) {
    	        counter++;
    	    } 
    	}
    	return counter;
    }
    
    public int getWords(String temp)
    {
    	int counter = 0;
    	for( int i=0; i<temp.length(); i++ ) {
    	    if( temp.charAt(i) == ' ' || temp.charAt(i) == '\n' ) {
    	        counter++;
    	    } 
    	}
    	return counter;
    }

    public void updateLog(DocumentEvent e, String action) {
        Document doc = (Document)e.getDocument();
        int changeLength = e.getLength();
        try {
			modif.append(
					changeLength + " character" +
				            ((changeLength == 1) ? " " : "s ") +
				            action + "." + newLine +
				            "  Number of lines = " + getLines(doc.getText(0, doc.getLength())) + newLine +
				            "  Number of words = " + getWords(doc.getText(0, doc.getLength())) + newLine +
				            "  Text length = " + doc.getLength() + newLine/*+
				            "  New text = "+ doc.getText(0, doc.getLength()) + newLine*/);
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

}
