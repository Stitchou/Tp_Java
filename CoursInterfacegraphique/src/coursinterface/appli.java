package coursinterface;

import javax.swing.SwingUtilities;

public class appli {

		public static void main ( String [] args)
		{
			Runnable r = new Runnable ()
			{
			    public void run()  {
			        new MyUI();
			    }
			};
			SwingUtilities.invokeLater(r);
		}
		/*
		 * public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					card window = new card();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		 */
}
