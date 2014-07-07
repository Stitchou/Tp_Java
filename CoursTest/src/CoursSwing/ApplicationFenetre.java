package CoursSwing;

import javax.swing.SwingUtilities;



public class ApplicationFenetre {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		       new MyUI("Cours Swing/AWT - JAVA");
		    	//new MyGridBagLayout("Cours Swing/AWT - JAVA - GridBagLayout");
		    	//new MyBoxLayout("Cours Swing/AWT - JAVA - BoxLayout");
		    }
		});
	}

}
